package com.jan.personafy.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("users")
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String occupation;  
    private String about;
    private List<Education> educationList;
    private List<WorkExperience> workExperiences;
    private List<PersonalProject> personalProjects;
    private List<Extracurricular> extracurriculars;


    public User(String id, String firstName, String lastName, String occupation, String about) {
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

    public List<Education> getEducation(){
        return Collections.unmodifiableList(this.educationList);
    }

    public List<WorkExperience> getWorkExperiences(){
        return Collections.unmodifiableList(this.workExperiences);
    }

    public List<PersonalProject> getPersonalProjects(){
        return Collections.unmodifiableList(this.personalProjects);
    }

    public List<Extracurricular> getExtracurriculars(){
        return Collections.unmodifiableList(this.extracurriculars);
    }

    public void addEducation(Education education){
        this.educationList.add(education);
    }

    public void addWorkExperience(WorkExperience workExperience){
        this.workExperiences.add(workExperience);
    }

    public void addPersonalProject(PersonalProject personalProject){
        this.personalProjects.add(personalProject);
    }

    public void addExtracurricular(Extracurricular extracurricular){
        this.extracurriculars.add(extracurricular);
    }   

    public String getAbout() {
        return this.about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
