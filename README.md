# Spring Boot Initializr

We're going to go over the website start.spring.io <br>

1) Snapshot builds: SNAPSHOT is the special version that indicates current deployment copy and not a regular, specific version. <br>
 
A snapshot version in Maven is one that has not been released. <br>

The idea is that before a 1.0 release (or any other release) is done, there exists a 1.0-SNAPSHOT. That version is what might become 1.0. It's basically "1.0 under 

development". This might be close to a real 1.0 release, or pretty far (right after the 0.9 release, for example).<br>

2) Release builds: Release means removing the SNAPSHOT at the version ID for the build. These are the regular build versions.<br>

Usually, snapshot dependencies should only exist during development and no released version (i.e. no non-snapshot) should have a dependency on a snapshot version.<br>

3)  JAR Packaging <br><br>
Essentially, it's a zipped file containing the compressed versions of .class files and resources of compiled Java libraries and applications.
<pre>
META-INF/
    MANIFEST.MF
com/
    baeldung/
        MyApplication.class
</pre><br>

The META-INF/MANIFEST.MF file may contain additional metadata about the files stored in the archive.<br>
We can create a JAR file using the jar command or with tools like Maven.<br>
<br>
4) WAR Packaging <br><br>
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
</pre><br>
5) Dependencies <br>
Spring Web Build web<br>
including RESTful, applications using Spring MVC. Uses Apache Tomcat.<br>
Spring Data JPA <br>
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate. ORM  (object-relational mapping) <br>
H2 Database SQL<br>
Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint<br>
Thymeleaf TEMPLATE ENGINES<br>
A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers.<br>
Spring Boot Actuator. <br>
Supports built in (or custom) endpoints that let you monitor and manage your application. <br>
<br>
<h3> difference between spring-boot-starter-parent and spring-boot-parent</h3>
 
Spring Boot Starter Parent helps us with managing dependency versions, the java version used by project and the default configuration for plug-ins, as we don't<br> have to specify a lot of things manually.go to <a href="https://stackoverflow.com/questions/56955525/need-to-know-the-difference-between-spring-boot-starter-parent-and-spring-boot-p" target="_blank">this</a><br>

It helps us with the following :<br>

Configuration<br>
Dependency management<br>
Default plugin configuration (default configurations for maven-failsafe-plugin, maven-jar-plugin and maven-surefire-plugin etc)<br>
According to spring-boot <a href="https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-build-systems.html" target="_blank">doc</a> :<br>
The spring-boot-starter is the Core starter and provides functionalities including auto-configuration support, logging and YAML.It defines spring-boot-dependencies as the parent pom .<br>




