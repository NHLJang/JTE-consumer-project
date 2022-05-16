jte {
    allow_scm_jenkinsfile = false // If = true, Jenkinsfile will work as JTE template.
}
libraries {
    docker
}
application_environments {
    all {
        per_recipent = "my-user@mail.com"
    }
}