package com.studentmanagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStudentCreation() {

        Student student =
                new Student(101, "Harsika", "CSE", 8.3);

        assertEquals(101, student.getId());
        assertEquals("Harsika", student.getName());
        assertEquals("CSE", student.getDepartment());
        assertEquals(8.3, student.getCgpa());
    }

    @Test
    public void testStudentName() {

        Student student =
                new Student(102, "Anu", "IT", 9.1);

        assertEquals("Anu", student.getName());
    }

    @Test
    public void testStudentDepartment() {

        Student student =
                new Student(103, "Rahul", "ECE", 8.7);

        assertEquals("ECE", student.getDepartment());
    }

    @Test
    public void testStudentCgpa() {

        Student student =
                new Student(104, "Priya", "CSE", 9.2);

        assertEquals(9.2, student.getCgpa());
    }
}