node('master'){
echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
stage('initialize'){
checkout scm
}
stage('compile'){
 bat '''
mvn compile
'''
}
stage('unittest'){
bat '''
mvn test
'''
}
stage('build'){
bat '''
mvn package
'''
}
stage('archive'){

archiveArtifacts artifacts: '**/*.war'

}
stage('Deploy'){

deploy adapters: [tomcat8(credentialsId: 'a4b3d48e-7491-4d6b-b985-76bab681ec87', path: '', url: 'http://localhost:1234/')], contextPath: null, war: '**/*.war'


}
}