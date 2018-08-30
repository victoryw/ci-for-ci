pipelineJob('test-jekinsfile_converted') {
  description('')
  
  displayName('test-jekinsfile_converted')
  scm {
    git('https://github.com/victoryw/test-jekinsfile.git')
  }
  definition {
      cpsScm {
          scm {
              git('https://github.com/victoryw/test-jekinsfile.git')
          }
        }
  }

  triggers {
      scm('*/2 * * * *')
  }
}