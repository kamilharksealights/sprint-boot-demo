pipeline {
    agent any

    parameters {
        string(name: 'TOKEN', defaultValue: '', description: '')
    }

    stages {
        stage('build') {
            tools {
                jdk "1.8"
            }
            steps {
                sh "./gradlew clean build -DbuildName=${env.BUILD_NUMBER} -Dtoken=${params.TOKEN}"
            }
        }
    }
}