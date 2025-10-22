pipeline {
    agent any

    tools {
        maven 'Maven3'  // Make sure this matches your Jenkins Global Tool Configuration
        jdk 'JDK11'     // Make sure this matches your Jenkins Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                // Jenkins automatically checks out the repo when using "Pipeline script from SCM"
                // But you can explicitly define it:
                checkout scm
                echo 'Code checked out successfully!'
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling the project...'
                // Use 'bat' for Windows, 'sh' for Linux/Mac
                script {
                    if (isUnix()) {
                        sh 'mvn clean compile'
                    } else {
                        bat 'mvn clean compile'
                    }
                }
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests...'
                script {
                    if (isUnix()) {
                        sh 'mvn test'
                    } else {
                        bat 'mvn test'
                    }
                }
            }
        }

        stage('Build') {
            steps {
                echo 'Building the package...'
                script {
                    if (isUnix()) {
                        sh 'mvn package -DskipTests'
                    } else {
                        bat 'mvn package -DskipTests'
                    }
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                echo 'Artifact created: target/jenkins-demo-1.0-SNAPSHOT.jar'
            }
        }
    }

    post {
        success {
            echo '🎉 Build and tests completed successfully!'
            echo 'Build artifacts are ready in the target directory'
        }
        failure {
            echo '❌ Build failed. Check logs for errors.'
        }
        always {
            echo 'Pipeline execution completed.'
            // Archive the built artifacts
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
            // Publish test results
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
