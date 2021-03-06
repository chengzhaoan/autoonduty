echo off
set ENV=%1
IF [%1]==[] (
set ENV=dev
)
java -Xms256m -Xmx512m -server -Xloggc:../logs/gc.log -verbose:gc -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=../logs -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=9888 -Dcom.sun.management.jmxremote.ssl=FALSE -Dcom.sun.management.jmxremote.authenticate=FALSE -Dlogging.config=../config/logback.xml -Dspring.config.location=../config/application.properties,../config/messages_en.properties,../config/env/%ENV%/env-config.properties -Dloader.path="../lib"  -jar ../lib/autoonduty-0.0.1-SNAPSHOT.jar