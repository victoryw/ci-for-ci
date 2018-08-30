job = pipelineJob('test-jekinsfile-test-1')
job.with {
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

