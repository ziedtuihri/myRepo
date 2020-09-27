# Spring Boot Initializr

We're going to go over the website start.spring.io <br>

1) Snapshot builds: SNAPSHOT is the special version that indicates current deployment copy and not a regular, specific version. <br>
 
A snapshot version in Maven is one that has not been released. <br>

The idea is that before a 1.0 release (or any other release) is done, there exists a 1.0-SNAPSHOT. That version is what might become 1.0. It's basically "1.0 under 

development". This might be close to a real 1.0 release, or pretty far (right after the 0.9 release, for example).<br>

2) Release builds: Release means removing the SNAPSHOT at the version ID for the build. These are the regular build versions.<br>

Usually, snapshot dependencies should only exist during development and no released version (i.e. no non-snapshot) should have a dependency on a snapshot version.<br>

3)  JAR Packaging <br>
Essentially, it's a zipped file containing the compressed versions of .class files and resources of compiled Java libraries and applications.
<br> 
<pre>
META-INF/
    MANIFEST.MF
com/
    baeldung/
        MyApplication.class
</pre>

The META-INF/MANIFEST.MF file may contain additional metadata about the files stored in the archive.<br>
We can create a JAR file using the jar command or with tools like Maven.<br>
<br>
4) WAR Packaging <br>
WAR stands for Web Application Archive or Web Application Resource.<br>
These archive files have the .war extension and are used to package web applications that we can deploy on any Servlet/JSP container.<br>
JSP is translated into Servlet before it is executed. So a JSP container must support Servlet.<br>
<pre>
META-INF/
    MANIFEST.MF
WEB-INF/
    web.xml
    jsp/
        helloWorld.jsp
    classes/
        static/
        templates/
        application.properties
    lib/
        // *.jar files as libs
</pre>




