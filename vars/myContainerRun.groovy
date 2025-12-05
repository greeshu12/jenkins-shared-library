def call(String serviceName, int port) {
    echo "===== RUNNING CONTAINER USING PODMAN ====="

    sh """
        podman rm -f ${serviceName}_container || true
        podman run -d -p ${port}:8000 --name ${serviceName}_container ${serviceName}:latest
    """
}
