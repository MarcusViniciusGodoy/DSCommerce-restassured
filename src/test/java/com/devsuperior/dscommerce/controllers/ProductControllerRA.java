package com.devsuperior.dscommerce.controllers;

import org.junit.jupiter.api.BeforeEach;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ProductControllerRA {

    @BeforeEach
    public void setUp(){

        baseURI = "http://localhost:8080";
    }
}
