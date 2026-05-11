package com.igor.petrov.springboot.learn_spring_boot;

//creating simple API

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "IgorPetrov"),
                new Course(2, "Learn DevOps", "IgorPetrov"),
                new Course(3, "Learn Azure", "IgorPetrov"),
                new Course(4, "Learn Kotlin", "IgorPetrov")

        );
    }

}
