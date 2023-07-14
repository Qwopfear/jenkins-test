package com.example.jenkinstest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class JenkinsTestApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testGetMethod() {

        ResponseEntity<String> getResponse =
                restTemplate.getForEntity("/api/jenkins/test",String.class);

        assertThat(getResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(getResponse.getBody()).isEqualTo("I got you ;)");


    }

}
