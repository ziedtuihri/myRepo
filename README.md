#Spring Boot Initializr

We're going to go over the website start.spring.io <br>

1) Snapshot builds: SNAPSHOT is the special version that indicates current deployment copy and not a regular, specific version. <br>
 
A snapshot version in Maven is one that has not been released. <br>

The idea is that before a 1.0 release (or any other release) is done, there exists a 1.0-SNAPSHOT. That version is what might become 1.0. It's basically "1.0 under 

development". This might be close to a real 1.0 release, or pretty far (right after the 0.9 release, for example).<br>

2) Release builds: Release means removing the SNAPSHOT at the version ID for the build. These are the regular build versions.<br>

Usually, snapshot dependencies should only exist during development and no released version (i.e. no non-snapshot) should have a dependency on a snapshot version.<br>

example of maven release process <br>



