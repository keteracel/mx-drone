mx-drone
========

running standalone jconsole with our plugin

``
> mvn clean package
> jconsole -pluginpath target/mxdrone-0.0.1.jar
``

debugging setup for Eclipse

: configure local tomcat server, adding the following VM flags
``
	-Dcom.sun.management.jmxremote
    -Dcom.sun.management.jmxremote.port=9012
    -Dcom.sun.management.jmxremote.ssl=false
    -Dcom.sun.management.jmxremote.authenticate=false
``
: start tomcat 

: add new `Java Application` run configuration, set main class to `sun.tools.jconsole.JConsole`
and program arguments to `-pluginpath target/mxdrone-0.0.1.jar`

: run/debug this new configuration, in remote process field type `localhost:9012` (our good old tomcat)

: you can now debug DronePlugin.java


