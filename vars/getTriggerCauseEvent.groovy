String getTriggerCauseEvent() {
    def buildCauseInfo = currentBuild.getBuildCauses("com.cloudbees.jenkins.plugins.pipeline.events.EventTriggerCause")
    println "retrieving payload"
    if (buildCauseInfo && buildCauseInfo[0])  {
        println "inside of conditional statement"
        String branch = buildCauseInfo[0].event.branch
        println "${branch}"
        return branch        
    }
    return "N/A"
}