node {
   stage('Preparation') {
      git 'https://github.com/MaxMargalith/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}
