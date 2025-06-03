```sh
export JAVA_OPTS="-Dspring.aot.enabled=true"
./mvnw clean compile spring-boot:process-aot package -Paot
./mvnw azure-functions:run
```

Go to [http://localhost:7071/api/helloWorld](http://localhost:7071/api/helloWorld)
