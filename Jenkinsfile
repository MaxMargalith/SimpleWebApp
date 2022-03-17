node {
   stage('Preparation') {
      git 'https://github.com/MaxMargalith/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
   stage('Deploy') {
      sh "git push https://git.heroku.com/evening-shelf-79025.git master"
   }
}
