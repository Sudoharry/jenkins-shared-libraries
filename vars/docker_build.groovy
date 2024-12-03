def call(String ProjectName, String ImageTag, String DockerHubUser) {
    try {
        sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
    } catch (Exception e) {
        error "Failed to build the Docker image: ${e.message}"
    }
}
