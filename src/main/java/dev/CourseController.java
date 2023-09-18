package dev;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/*
* Course Controller
* */
@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveCourses() {
        return Arrays.asList(
                new Course(1, "New AUS", "The Prime Gean"),
                new Course(2, "Learn DevOps", "Thomas Siebel"),
                new Course(3, "Who is your advocate?", "Prosper Otemuyiwa"),
                new Course(4, "Let us learn Vitest", "The Japan guy")
        );
    }
}
