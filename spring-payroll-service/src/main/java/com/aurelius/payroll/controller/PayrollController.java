package com.aurelius.payroll.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@RestController
public class PayrollController {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String callEmployeeService() throws UnirestException {
	Unirest.setObjectMapper(new ObjectMapper() {
	    private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper = new com.fasterxml.jackson.databind.ObjectMapper();

	    public <T> T readValue(String value, Class<T> valueType) {
		try {
		    return jacksonObjectMapper.readValue(value, valueType);
		} catch (IOException e) {
		    throw new RuntimeException(e);
		}
	    }

	    public String writeValue(Object value) {
		try {
		    return jacksonObjectMapper.writeValueAsString(value);
		} catch (JsonProcessingException e) {
		    throw new RuntimeException(e);
		}
	    }
	});

	HttpResponse<JsonNode> jsonResponse = Unirest.get(environment.getRequiredProperty("url.employee.service"))
	    .header("accept", "application/json")
	    .asJson();

	return "This response is from employee service: " + jsonResponse.getBody()
	    .toString();
    }
}
