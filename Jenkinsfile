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
    }
}