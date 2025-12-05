def call(String serviceName) {
    echo "===== CONTAINER BUILD USING PODMAN ====="

    sh """
        cd ${serviceName}
        podman build -t ${serviceName}:latest .
    """
}
