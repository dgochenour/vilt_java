#!/bin/sh
###############################################################################
##         (c) Copyright, Real-Time Innovations, All rights reserved.        ##
##                                                                           ##
##         Permission to modify and use for internal purposes granted.       ##
## This software is provided "as is", without warranty, express or implied.  ##
##                                                                           ##
###############################################################################

# You can override the following settings with the correct location of Java
if [ -z "$RTIJDKHOME" ]; then
    JAVAC=`which javac`
else
    JAVAC="$RTIJDKHOME/bin/javac"
fi

# Make sure JAVAC and NDDSHOME are set correctly
test -z "$JAVAC" && echo "javac not found" && exit 1
test -z "$NDDSHOME" && echo "NDDSHOME environment variable not set" && exit 1


ALL_SRC=`find . -name \*.java`

mkdir -p objs

# Builds all files from 'src' to 'objs'
echo "Building all the sources in 'src' into 'objs' directory..."
$JAVAC -d objs -classpath "$NDDSHOME/lib/java/nddsjava.jar" $ALL_SRC

