FROM openjdk:11.0-oracle
Copy "./target/demo-0.0.1-SNAPSHOT.jar" "app.jar"
Expose 8080
EntryPoint ["java","-jar", "app.jar"]
