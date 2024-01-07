package com.jan.personafy.dto;

import java.time.LocalDate;

public record WorkExperienceDTO (
    String company, 
    LocalDate startDate, 
    LocalDate endDate, 
    String position, 
    String description
) {
    
}
