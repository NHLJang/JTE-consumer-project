jte {
    allow_scm_jenkinsfile = true 
}
libraries {
    docker
}
application_environments {
    all {
        per_recipent = "my-user@mail.com"
    }
}