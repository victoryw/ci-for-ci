node {
    stage('monitor the clamin dependence to others') {
        jobDsl scriptText: '''job(\'clamin dependence to others\') {
            scm {
                git(\'git://github.com/quidryan/aws-sdk-test.git\')
            }
            triggers {
                scm(\'H/5 * * * *\')
            }
            steps {
                shell(\'replay1 a.exe\')
            }
        }'''

        jobDsl scriptText: '''job(\'others dependence to clamin\') {
            scm {
                git(\'git://github.com/quidryan/aws-sdk-test.git\')
            }
            triggers {
                scm(\'H/15 * * * *\')
            }
            steps {
                shell(\'replay a.exe\')
            }
        }'''

        jobDsl scriptText: '''job(\'others dependence to clamin\') {
            scm {
                git(\'https://github.com/victoryw/confidential-jenkins-job-dsl.git\') {
                    remote {
                        credentials(\'github-for-victoryw\')
                    }
                }
            }
            triggers {
                scm(\'H/15 * * * *\')
            }
            steps {
                shell(\'test.sh\')
            }
        }'''
    }
}