package com.bridgelabz.aidrivenresumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

public class AIResumeScreening {
    public static void main(String[] args) {
        List<Resume<?>> resumes = new ArrayList<>();

        // Creating resumes for different job roles
        Resume<SoftwareEngineer> seResume = new Resume<>("Alice Johnson", new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>("Bob Smith", new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>("Charlie Brown", new ProductManager());

        resumes.add(seResume);
        resumes.add(dsResume);
        resumes.add(pmResume);

        // Screening individual resumes
        ResumeScreeningSystem.screenResume(seResume);
        ResumeScreeningSystem.screenResume(dsResume);
        ResumeScreeningSystem.screenResume(pmResume);

        // Processing resumes in bulk
        List<JobRole> jobRoles = List.of(new SoftwareEngineer(), new DataScientist(), new ProductManager());
        ResumeScreeningSystem.processResumes(jobRoles);
    }
}
