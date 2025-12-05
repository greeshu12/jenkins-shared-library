def call(String serviceName) {
    echo "===== DEPLOY STAGE (from shared library) ====="
    echo "Deploying service: ${serviceName}"

    sh """
        echo "Simulating deployment for ${serviceName}..."
    """
}
