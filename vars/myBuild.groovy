def call() {
    echo "===== BUILD STAGE (from shared library) ====="

    sh '''
        echo "Checking Python version..."

        if command -v python3 >/dev/null 2>&1; then
            python3 --version
        elif command -v python >/dev/null 2>&1; then
            python --version
        else
            echo "Python NOT installed!"
            exit 1
        fi
    '''
}
