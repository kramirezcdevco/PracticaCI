pipeline {
  agent any
  stages {
    stage('clean') {
      steps {
        bat 'gradlew clean'
      }
    }

    stage('build') {
      steps {
        bat 'gradlew build -x test '
      }
    }

    stage('test') {
      steps {
        bat 'gradlew test'
      }
    }

    stage('cobertura') {
      steps {
        bat 'gradlew jacocoTestReport'
      }
    }

  }
}