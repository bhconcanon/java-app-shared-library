#!/usr/bin/env groovy

def call(Map config=[:]) {

	println "Last Run: " + build.getTimestampString()
	println "Last Run Date and Time: " + build.getTimestampString2()
	println "Build Time In Ms: " + build.running duration()
	println "End time: " + new Date(((long)build.getStartTimeInMillis() + build.duration))
}