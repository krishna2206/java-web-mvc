## Java web app (MVC)

This is a simple Java web app to get started, using the MVC pattern.

### Pre-requisites

* Java 11
* Maven 3
* Apache Tomcat 9

### How to build and deploy

If a tomcat server is already installed and running, you can build and deploy the app with one of the following methods:

#### Deploy with maven

Before deploying with maven, add the following to your `settings.xml` file.

There are two locations where the settings.xml file may be found:

* The Maven install: ```${maven.home}/conf/settings.xml```
* A user’s install: ```${user.home}/.m2/settings.xml```

```xml
    <server>
      <id>TomcatServer</id>
      <username>admin</username>
      <password>admin</password>
    </server>
```
NB: The *username* and *password* are the ones you use to log into the tomcat server.


Then, run the following command:

```bash
    mvn tomcat9:deploy
```

#### Build and deploy manually

If you don't use maven, you can build the app and copy the war file to the tomcat webapps folder.

```bash
    mvn clean package
    cp target/*.war /path/to/tomcat/webapps
```

### How to run

#### If you deployed with maven/build and deployed manually

* Assume the tomcat server is running on port 8080, then you can access the app at http://localhost:8080/java-web-mvc

#### If you neither deployed with maven nor build and deployed manually

There is a method which allows you to run the app without deploying it. This is useful for development purposes.

```bash
    mvn tomcat9:run
```
