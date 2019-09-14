node('master'){

echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
stage('initialize'){
checkout scm
}
stage('compile'){
 sh '''
mvn compile
'''
}
stage('unittest'){
    steps{
sh '''
mvn test
'''
    }
    post{
        always{
             junit testResults:"target/surefire-reports/*.xml"
        }
    }
}
stage('build'){
sh '''
mvn package -DskipTests
'''
}
stage('archive'){

archiveArtifacts artifacts: '**/*.war'

}
stage('Deploy'){

sh '''

    docker build -t app/tomcat .
docker run -d -p 8080:8080 --name app-container app/tomcat

'''

}
}