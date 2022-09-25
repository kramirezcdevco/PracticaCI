pipeline {
  agent any
  stages {
    stage('clean') {
      steps {
        build 'clean'
      }
    }

    stage('build') {
      steps {
        build 'build'
      }
    }

    stage('test') {
      steps {
        build 'test'
      }
    }

    stage('cobertura') {
      steps {
        build 'cobertura'
      }
    }

    stage('sonar') {
      steps {
        build 'sonar'
      }
    }

  }
}