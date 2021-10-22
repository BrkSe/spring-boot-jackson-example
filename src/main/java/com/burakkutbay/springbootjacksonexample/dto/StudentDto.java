package com.burakkutbay.springbootjacksonexample.dto;

import com.burakkutbay.springbootjacksonexample.model.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class StudentDto {

    @Autowired
    ObjectMapper objectMapper;

    public Student getStudent() {
        return new Student(1L, "Burak", "KUTBAY", "Oxford", new BigDecimal("2499.99"), OffsetDateTime.now());
    }


    public void serializeStudent() throws JsonProcessingException {
        Student student = getStudent();
        String jsonString = objectMapper.writeValueAsString(student);
    }


    public void deserializeStudent() throws JsonProcessingException {
        String json = "{\"schoolPrice\":\"2499.99\",\"createdDate\":\"2020-09-02T23:40:01.478001-09:00\",\"studentNumber\":1,\"studentName\":\"Burak\",\"studentSurname\":\"KUTBAY\",\"studentSchoolName\":\"Oxford\"}";
        Student student = objectMapper.readValue(json, Student.class);
    }
}
