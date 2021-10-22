package com.burakkutbay.springbootjacksonexample.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Student {

    @JsonProperty("studentNumber")
    private Long id;

    @JsonProperty("studentName")
    private String name;

    @JsonProperty("studentSurname")
    private String surName;

    @JsonProperty("studentSchoolName")
    private String schoolName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal schoolPrice;

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private OffsetDateTime createdDate;

    public Student(Long id, String name, String surName, String schoolName, BigDecimal schoolPrice, OffsetDateTime createdDate) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.schoolName = schoolName;
        this.schoolPrice = schoolPrice;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public BigDecimal getSchoolPrice() {
        return schoolPrice;
    }

    public void setSchoolPrice(BigDecimal schoolPrice) {
        this.schoolPrice = schoolPrice;
    }

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", schoolPrice=" + schoolPrice +
                ", createdDate=" + createdDate +
                '}';
    }
}
