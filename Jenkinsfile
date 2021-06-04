pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/tajinder-singh/SpringBootApp.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn package'
            }
        }
        //stage('Deploy') {
          //  steps {
            //    echo 'Deploying....'
            //}
        //}
    }
}
