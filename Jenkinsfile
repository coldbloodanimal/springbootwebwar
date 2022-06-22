pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
                sh 'mv springbooot_web_war-0.0.1-SNAPSHOT.war /usr/mytool/apache-tomcat-9.0.64/webapps'
            }
        }
    }
}