#!/bin/sh
rm -rf output
mkdir -p output
chmod u+x ./gradle/dists/gradle/bin/gradle

case $1 in
online|qa|dev|sb)
	echo "build with $1 profile..."
	sh gradle.sh -Pprofile=$1 clean copyConf zip war;;
*)
	echo "build with dev profile..."
	sh gradle.sh -Pprofile=dev clean copyConf zip war;;
esac

#copy zip
cp hui-api/output/* output/
cp hui-task/output/* output/
cp hui-web/output/* output/
cp hui-dispatcher/output/* output/
