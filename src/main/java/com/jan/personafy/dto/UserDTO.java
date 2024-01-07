package com.jan.personafy.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class UserDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String occupation;  
    private String about;
    private List<EducationDTO> educationList;
    private List<WorkExperienceDTO> workExperiences;
    private List<PersonalProjectDTO> personalProjects;
    private List<ExtracurricularDTO> extracurriculars;

    public UserDTO(
        String id, 
        String firstName, 
        String lastName, 
        String occupation, 
        String about) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.about = about;
        this.educationList = new ArrayList<>();
        this.workExperiences = new ArrayList<>();
        this.personalProjects = new ArrayList<>();
        this.extracurriculars = new ArrayList<>();
    }

    public List<EducationDTO> getEducation(){
        return Collections.unmodifiableList(this.educationList);
    }

    public List<WorkExperienceDTO> getWorkExperiences(){
        return Collections.unmodifiableList(this.workExperiences);
    }

    public List<PersonalProjectDTO> getPersonalProjects(){
        return Collections.unmodifiableList(this.personalProjects);
    }

    public List<ExtracurricularDTO> getExtracurriculars(){
        return Collections.unmodifiableList(this.extracurriculars);
    }

    public void addEducation(EducationDTO education){
        this.educationList.add(education);
    }

    public void addWorkExperience(WorkExperienceDTO workExperience){
        this.workExperiences.add(workExperience);
    }

    public void addPersonalProject(PersonalProjectDTO personalProject){
        this.personalProjects.add(personalProject);
    }

    public void addExtracurricular(ExtracurricularDTO extracurricular){
        this.extracurriculars.add(extracurricular);
    }   

    public String getAbout() {
        return this.about;
    }

    public String getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getOccupation() {
        return this.occupation;
    }

}
