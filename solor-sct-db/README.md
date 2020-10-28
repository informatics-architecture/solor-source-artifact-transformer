SOLOR Database builder
======================

Tooling to assemble a SOLOR database from IBDF artifacts. 

    <groupId>one.solor</groupId>
    <artifactId>solor-db</artifactId>
    <name>${project.parent.artifactId}: ${project.artifactId}</name>
    
    <version>1.2-SNAPSHOT</version>
    <packaging>pom</packaging>


Build & Release Notes

Lucene indexing takes a significant amount of memory. If insufficient
memory is allocated, the process with thrash, and may not complete in reasonable
time. If sufficient memory is allocated, it should complete in 5-10
minutes. 

## Setting sufficient memory
On the command line executing the process, execute the following: 
```
$ export MAVEN_OPTS="-Xmx12g -XX:+UseG1GC"
```
## Performing a release

Substitute your server address for example.com in the below example. 
```
mvn -DaltDeploymentRepository=central::default::http://example.com/artifactory/libs-release-local \
 jgitflow:release-start jgitflow:release-finish
```

Example output from successful release:
```
...  
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 06:28 min
    [INFO] Finished at: 2017-03-25T10:42:43-07:00
    [INFO] Final Memory: 1795M/5984M
    [INFO] ------------------------------------------------------------------------
[INFO] (develop) copying pom versions...
[INFO] (develop) updating poms for all projects...
[INFO] turn on debug logging with -X to see exact changes
[INFO] (develop) updating pom for db-builder: solor-db...
[INFO] copying pom versions...
[INFO] (develop) updating poms for all projects...
[INFO] turn on debug logging with -X to see exact changes
[INFO] (develop) updating pom for db-builder: solor-db...
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 06:56 min
[INFO] Finished at: 2017-03-25T10:43:03-07:00
[INFO] Final Memory: 13M/46M
[INFO] ------------------------------------------------------------------------

```
