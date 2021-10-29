# Wiremock Unit Testing example of Spring API

### Reference Documentation
For further reference, please consider the following sections:

* [Gradle documentation](https://docs.gradle.org)
* [Docker Compose Overview](https://docs.docker.com/compose/overview/) 
* [Spring Boot Overview](https://spring.io/projects/spring-boot)
* [Wiremock Overview](http://wiremock.org/)

### Build
```
$ ./gradlew build
```

### Run
```
$ docker-compose up
```

### Use
[try](http://localhost:8080)

### Debug
[docker-compose.override.yml](https://docs.docker.com/compose/extends/)
```
version: '3'
services:
  penr-oz-springapi-wiremock:
    entrypoint: java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=0.0.0.0:5005
    ports:
      - "8080:8080"
      - "5005:5005"
```
then
```
$ docker-compose up
```
finally use your favorite IDE to put breakpoints and connect to debugger
e.g.
[Intellij Remote Java](https://www.jetbrains.com/help/idea/run-debug-configuration-remote-debug.html)
which requires a correct local [JDK](https://jdk.java.net/11/)
installed.

### Stop
```
$ docker-compose stop
```

### Clean
```
$ docker-compose down
```

### Check/Health
```
docker-compose ps
```
