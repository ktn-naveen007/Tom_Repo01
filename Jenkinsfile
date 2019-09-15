pipeline{

agent any
stages{
/* stage('initialize'){
    steps{
checkout scm
}
} */

stage('compile'){
    steps{
 sh '''
mvn compile
'''
}
}

steps{
stage('unittest'){
    
sh '''
mvn test
'''
}  
    
}
post{
        always{
             junit testResults:"target/surefire-reports/*.xml"
        }
    }
stage('build'){
    steps{
sh '''
mvn package -DskipTests
'''
}
}
steps{
stage('archive'){

archiveArtifacts artifacts: '**/*.war'
}
}
steps{
stage('Deploy'){

sh '''

    docker build -t app/tomcat .
docker run -d -p 8080:8080 --name app-container app/tomcat

'''
}
}
}
}