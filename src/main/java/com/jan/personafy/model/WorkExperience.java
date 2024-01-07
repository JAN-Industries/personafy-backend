package com.jan.personafy.model;

import java.time.LocalDate;

public record WorkExperience(
    String company, 
    LocalDate startDate, 
    LocalDate endDate, 
    String position, 
    String description) {
    
}
