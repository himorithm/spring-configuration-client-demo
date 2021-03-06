package com.himanshu.configClient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource("classpath:config/client-test.properties")
public class DemoConfigurationClienControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void message() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("/", String.class);
        String responseEntityBody = responseEntity.getBody();
        assertEquals(responseEntityBody, "I only get Integration Test work for Spring");
    }
}