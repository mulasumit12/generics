package com.bridgelabz.universitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class UniversityCourseSystem {
    public static void main(String[] args) {
        List<Course<?>> courseCatalog = new ArrayList<>();

        // Adding different courses to the catalog
        Course<ExamCourse> mathCourse = new Course<>("Mathematics", "Science", new ExamCourse());
        Course<AssignmentCourse> historyCourse = new Course<>("World History", "Arts", new AssignmentCourse());
        Course<ResearchCourse> aiCourse = new Course<>("Artificial Intelligence", "Computer Science", new ResearchCourse());

        courseCatalog.add(mathCourse);
        courseCatalog.add(historyCourse);
        courseCatalog.add(aiCourse);

        // Displaying courses
        System.out.println("\nUniversity Course Catalog:");
        for (Course<?> course : courseCatalog) {
            System.out.println(course);
        }
    }
}

