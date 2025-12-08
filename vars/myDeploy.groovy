def call(String serviceName) {
    echo "===== DEPLOY STAGE ====="
    echo "Deploying: ${serviceName}"

    echo ">>> NEW UPDATE: Shared Library Change Applied! <<<"

    sh "echo Simulating deployment for ${serviceName}"
}
