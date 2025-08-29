pipeline {
    agent any

    tools {
        jdk 'JDK17'      
        maven 'Maven3'   
    }

    stages {
        stage('Checkout') {
            steps {
                echo "Cloning repo"
                git branch: 'main', url: 'https://github.com/Rdeekshitha123/Java.git'
            }
        }

        stage('Build') {
            steps {
                echo "Building project"
                sh 'mvn clean compile'
            }
        }

        stage('Unit Tests') {
            steps {
                echo "Running unit tests..."
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package Artifact') {
            steps {
                echo "Packaging JAR..."
                sh 'mvn package'
            }
            post {
                success {
                    archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
                }
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying artifact"
               
            }
        }
    }
}
