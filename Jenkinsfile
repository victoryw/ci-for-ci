node {
    println "current space is ${PWD}"

    jobDsl scriptText: '''job(\'DSL-Tutorial-1-Test-2\') {
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

    jobDsl scriptText: '''job(\'DSL-Tutorial-1-Test-3\') {
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