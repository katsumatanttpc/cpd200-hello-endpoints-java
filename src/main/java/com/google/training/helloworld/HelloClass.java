package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello Endpoints";

    public HelloClass () {
    }

    public HelloClass (String name) {
        message = "Hello " + name + "!";
    }

    public String getMessage() {
        return message;
    }
}
