# PatientBatchLoader

![Spring Framework](https://1.bp.blogspot.com/-zv-NdfqVpws/XX0E7B-9HbI/AAAAAAAABvA/zniyto4IMEg0DZn_-CH19AmDt4R0PBDygCPcBGAYYCw/s1600/top-10-reasons-to-use-spring-framework-1.jpg)

This application was originally generated using JHipster 4.13.0, you can find documentation and help at [http://www.jhipster.tech/documentation-archive/v4.13.0](http://www.jhipster.tech/documentation-archive/v4.13.0). After generation, I stripped out many of the features that were unnecessary for the Spring Batch example. 

## Dependencies

### Java

This application is built for an runs on JDK 1.8. If you wanted to leverage JDK 9, you will need to make changes to your JVM to add modules, such as JAXB, for dependencies to work correctly. 

### Gradle

The project makes use of Gradle as the build tool. The Gradle wrapper is used to assure consistency of version. This application was built and runs with Gradle version 4.4.1.

### IDE

The project was built using IntelliJ IDEA.

### Spring Boot

The project leverages Spring Boot version 2.0.0.RELEASE. 

### Spring Batch

The project leverages Spring Batch version 4.0.0.RELEASE.

## Development

To start your application in the dev profile, simply run:

    ./gradlew

## Testing

To launch your application's tests, run:

    ./gradlew test

## Building for production

To optimize the PatientBatchLoader application for production, run:

    ./gradlew -Pprod clean bootRepackage

To ensure everything worked, run:

    java -jar build/libs/*.war


### Enlaces importantes

* [Spring Batch Tutorial](https://www.briansdevblog.com/2014/04/spring-batch-tutorial/)

* [Constellation Spring Batch](https://calmintrees.blogspot.com/2018/05/constellation-tatsu-spring-batch.html)

* [How to execute un job](http://java-is-everywhere.blogspot.com/2016/11/how-to-execute-spring-batch-job.html)

* [Spring Batch books](https://javarevisited.blogspot.com/2018/04/5-spring-framework-books-experienced-Java-developers-2018.html)

* [Tutoriales](http://krams915.blogspot.com/p/tutorials.html)


