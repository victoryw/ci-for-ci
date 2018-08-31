node {
    stage('CHECKOUT') {
        git  url: 'https://github.com/victoryw/ci-for-ci.git'
    }

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

        jobDsl scriptText: '''job(\'confidential-jekins-job-dsl\') {
            scm {
                git {
                    remote {
                        url(\'https://github.com/victoryw/confidential-jenkins-job-dsl.git\')
                        credentials(\'github-for-victoryw\')
                    }
                }
            }
            triggers {
                scm(\'H/15 * * * *\')
            }
            steps {
                shell(\'./test.sh\')
            }
        }'''

        jobDsl targets:['./jobs/**/*.groovy'].join('\n')
    }
}