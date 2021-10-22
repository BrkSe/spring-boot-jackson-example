package com.burakkutbay.springbootjacksonexample;

import com.burakkutbay.springbootjacksonexample.model.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@SpringBootTest
class SpringBootJacksonExampleApplicationTests {


    @Autowired
    ObjectMapper objectMapper;

    Student getStudent() {
        return new Student(1L, "Burak", "KUTBAY", "Oxford",new BigDecimal("2499.99"), OffsetDateTime.now());
    }

    @Test
    void serializeStudent() throws JsonProcessingException {
        Student student = getStudent();
        String jsonString = objectMapper.writeValueAsString(student);
    }


    @Test
    void deserializeStudent() throws JsonProcessingException {
        String json="{\"schoolPrice\":\"2499.99\",\"createdDate\":\"2020-09-02T23:40:01.478001-09:00\",\"studentNumber\":1,\"studentName\":\"Burak\",\"studentSurname\":\"KUTBAY\",\"studentSchoolName\":\"Oxford\"}";
        Student student=objectMapper.readValue(json, Student.class);
    }


}
