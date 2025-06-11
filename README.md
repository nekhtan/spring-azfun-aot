```shell
./mvnw -B clean compile spring-boot:process-aot package -DskipTests -Paot
./mvnw azure-functions:run
```

Then navigate to [http://localhost:7071/api/helloWorld](http://localhost:7071/api/helloWorld)