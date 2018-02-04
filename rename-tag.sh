#!/bin/sh
new=$1
old=$2
git tag $new $old
git tag -d $old
git push origin :refs/tags/$old
git push --tags