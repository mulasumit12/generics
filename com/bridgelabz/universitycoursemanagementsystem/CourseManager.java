package com.bridgelabz.universitycoursemanagementsystem;
import java.util.*;
class CourseManager {
    public static void displayCourses(List<? extends CourseType> courses) {
        System.out.println("\nAvailable Courses:");
        for (CourseType course : courses) {
            System.out.println(course.getTypeName());
        }
    }
}