package com.RSA.resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Utils {
    public static RequestSpecification getReqSpec(String url) throws FileNotFoundException {
        PrintStream log = new PrintStream(new FileOutputStream("loggingAPI.txt"));
        RequestSpecification req = new RequestSpecBuilder()
                .setBaseUri(url)
                .addQueryParam("key","qaclick123")
                .addFilter(RequestLoggingFilter.logRequestTo(log))
                .addFilter(ResponseLoggingFilter.logResponseTo(log))
                .setContentType(ContentType.JSON).build();
        return req;
    }
}
