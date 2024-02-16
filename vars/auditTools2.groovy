def call(Map config) {
    node {
        // echo and print out the message passed in 
        echo "${config.message}... Add some processing within the auditTools2 function call"
        sh '''
            git version
            java -version
            mvn -version
        '''
    }
}