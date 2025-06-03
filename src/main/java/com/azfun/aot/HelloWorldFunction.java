package com.azfun.aot;

import org.springframework.stereotype.Component;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

import java.util.Optional;

@Component
public class HelloWorldFunction {

    @FunctionName("helloWorld")
    public String hello(
        @HttpTrigger(name = "hello", methods = { HttpMethod.GET }, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<Void>> request,
        ExecutionContext context) {
        return "Hello, World!";
    }
}
