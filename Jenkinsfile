node {
    println "${PWD}"
    hudson.FilePath workspace = hudson.model.Executor.currentExecutor().getCurrentWorkspace()
    workspace.list().each {
        println "path is ${it}"
    }

    jobDsl scriptText: '''job(\'DSL-Tutorial-1-Test-2\') {
        println readFileFromWorkspace('jobs/demo.dsl.groovy')
    scm {
        git(\'git://github.com/quidryan/aws-sdk-test.git\')
    }
    triggers {
        scm(\'H/15 * * * *\')
    }
    steps {
        maven(\'-e clean test\')
    }
    }'''
}