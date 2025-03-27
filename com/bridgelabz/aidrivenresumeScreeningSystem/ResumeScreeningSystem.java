package com.bridgelabz.aidrivenresumeScreeningSystem;
import java.util.*;
class ResumeScreeningSystem {
    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println("Screening resume for: " + resume.getCandidateName() + " - " + resume.getJobRole().getRoleName());
    }

    public static void processResumes(List<? extends JobRole> jobRoles) {
        System.out.println("\nProcessing resumes for different job roles:");
        for (JobRole jobRole : jobRoles) {
            System.out.println("Processing applications for " + jobRole.getRoleName());
        }
    }
}