# Payara-micro default behavior - Demo

This project is to show the default behaviour I expect for payara-micro, I did a proposal to this feature on 
[this fork](https://github.com/pablobastidasv/maven-plugins)

## Prerequisites

  * Maven 3.5 (Install from here [http://maven.apache.org/]())
  * Java JDK 7 or above (Download from [here](java.sun.com))
  * git (Installation instructions [here](https://git-scm.com/))

## Installing the plugin locally

Initially you will need the new `maven-payara-plugin` version installed in your maven local repository, 
do the below steps:

```bash
git clone https://github.com/pablobastidasv/maven-plugins
cd maven-plugins/payara-micro-maven-plugin
mvn clean install
```

With this steps the `maven-payara-plugin` will be installed in your local repository.

## Running the example

Once the plugin `v.1.0.2-SNAPSHOT` is installed in your local repository, lets going to run the example.

```bash
git clone https://github.com/pablobastidasv/payara-maven-plugin-example.git
cd payara-maven-plugin-example/payara-micro-maven-plugin
./mvnw clean install
./mvnw payara-micro:start
``` 

Now you should see a nice message in `http://localhost:8080/demo/api/hello`

### Docker

If you want to test this project in a "real" docker container, you can do it as you do with any `war` file,
in this project is provided a nice `Dockerfile` and a script to run it. To run it with with script do the 
below steps:

```bash
./build_and_run.sh
```

Once you run the script you should be able to see a nice message in `http://localhost:8080/demo/api/hello`