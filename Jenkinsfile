node {
    stage('monitor the clamin dependence to others') {
        jobDsl scriptText: '''job(\'clamin dependence to others\') {
            scm {
                git(\'git://github.com/quidryan/aws-sdk-test.git\')
            }
            triggers {
                scm(\'H/15 * * * *\')
            }
            steps {
                sh('replay a.exe'')
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
                sh('replay a.exe'')
            }
        }'''
    }
}