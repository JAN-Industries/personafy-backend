package com.jan.personafy.mapper;

import com.jan.personafy.dto.EducationDTO;
import com.jan.personafy.dto.ExtracurricularDTO;
import com.jan.personafy.dto.PersonalProjectDTO;
import com.jan.personafy.dto.UserDTO;
import com.jan.personafy.dto.WorkExperienceDTO;
import com.jan.personafy.model.Education;
import com.jan.personafy.model.Extracurricular;
import com.jan.personafy.model.PersonalProject;
import com.jan.personafy.model.User;
import com.jan.personafy.model.WorkExperience;

public class UserMapper {

    public User convertToEntity(UserDTO userDTO) {
        User user = new User(userDTO.getId(), userDTO.getFirstName(), userDTO.getLastName(), userDTO.getOccupation(),
                userDTO.getAbout());

        userDTO.getEducation().forEach(educationDTO -> user.addEducation(
            new Education(educationDTO.schoolName(), educationDTO.degree(), educationDTO.fieldOfStudy())));

        userDTO.getWorkExperiences().forEach(workExperienceDTO -> user.addWorkExperience(
                new WorkExperience(
                        workExperienceDTO.company(),
                        workExperienceDTO.startDate(),
                        workExperienceDTO.endDate(),
                        workExperienceDTO.position(),
                        workExperienceDTO.description())));
        
        userDTO.getPersonalProjects().forEach(personalProjectDTO -> user.addPersonalProject(
                new PersonalProject(
                        personalProjectDTO.name(),
                        personalProjectDTO.startDate(),
                        personalProjectDTO.endDate(),
                        personalProjectDTO.role(),
                        personalProjectDTO.description())));
        
        userDTO.getExtracurriculars().forEach(extracurricularDTO -> user.addExtracurricular(
                new Extracurricular(
                        extracurricularDTO.name(),
                        extracurricularDTO.startDate(),
                        extracurricularDTO.endDate(),
                        extracurricularDTO.role(),
                        extracurricularDTO.description())));
                        

        return user;
    }

    public UserDTO convertToDTO(User user) {
        UserDTO userDTO = new UserDTO(user.getId(), user.getFirstName(), user.getLastName(), user.getOccupation(),
                user.getAbout());

        user.getEducation().forEach(education -> userDTO.addEducation(
            new EducationDTO(education.school(), education.degreeLevel(), education.fieldOfStudy())));

        user.getWorkExperiences().forEach(workExperience -> userDTO.addWorkExperience(
                new WorkExperienceDTO(
                        workExperience.company(),
                        workExperience.startDate(),
                        workExperience.endDate(),
                        workExperience.position(),
                        workExperience.description())));
        
        user.getPersonalProjects().forEach(personalProject-> userDTO.addPersonalProject(
                new PersonalProjectDTO(
                        personalProject.name(),
                        personalProject.startDate(),
                        personalProject.endDate(),
                        personalProject.role(),
                        personalProject.description())));
        
        user.getExtracurriculars().forEach(extracurricular -> userDTO.addExtracurricular(
                new ExtracurricularDTO(
                        extracurricular.name(),
                        extracurricular.startDate(),
                        extracurricular.endDate(),
                        extracurricular.role(),
                        extracurricular.description())));

        return userDTO;
    }

}
