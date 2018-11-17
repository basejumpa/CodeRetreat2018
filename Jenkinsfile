nodeWithCleanup('WindowsAgents') {
   checkout scm
  
   bat """
   groovyw helloGroovy
   groovyw helloAssert
   setProxies
   groovyw FizzBuzzSpec
   groovyw helloExcel
   """

   step([$class: 'ArtifactArchiver', artifacts: 'spock-reports/**', excludes: null])
}
