def call(String serviceName) {
    echo "===== DEPLOY STAGE ====="
    echo "Deploying: ${serviceName}"

    sh "echo Simulating deployment for ${serviceName}"
}
