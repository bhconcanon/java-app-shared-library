#!/usr/bin/env groovy

def call(def config=[:]) {

sh """
    dt=$(date '+%d/%m/%Y %H:%M:%S')
    echo "Build ended at $dt"
   """

}