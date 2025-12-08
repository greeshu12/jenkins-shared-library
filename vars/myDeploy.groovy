def call(String serviceName) {
    echo "===== DEPLOY STAGE ====="
    echo "Deploying: ${serviceName}"

    // New shared library update
    echo "Hello from ${serviceName} - Shared Library Update Applied!"

    sh "echo Simulating deployment for ${serviceName}"
}
