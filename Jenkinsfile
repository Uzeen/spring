pipeline{
    agent any
    stages{
        stage("Checkout Java code"){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Uzeen/spring']]])
                echo 'checkout successfull'
            }
        }
        stage("Build java artifact"){
            steps{
                sh 'mvn clean install'
                echo 'Build successfull'
            }
        }
        stage("archive articact"){
            steps{
                archive '**/*SNAPSHOT.war'
                echo "archive successfull"
            }
        }
        stage("Copy war file in docker server"){
            steps{
               sshagent(['tomcat_user']) {
                   sh 'scp -o StrictHostKeyChecking=no **/*SNAPSHOT.war Dockerfile ubuntu@13.233.253.7:/home/ubuntu/docker'
                   sh "ssh -o StrictHostKeyChecking=no ubuntu@13.233.253.7 'sudo docker build /home/ubuntu/docker -t code:${env.BUILD_ID}'"
                }
            }
        }
        stage("Creating the Container"){
            steps{
               sshagent(['tomcat_user']) {
                   sh "ssh -o StrictHostKeyChecking=no ubuntu@13.233.253.7 'sudo docker container rm -f Dev'"
                   sh "ssh -o StrictHostKeyChecking=no ubuntu@13.233.253.7 'sudo docker container run -p 8080:8080 -d --name Dev code:${env.BUILD_ID}'"
                }
            }
        }
    }
}