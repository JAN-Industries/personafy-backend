package com.jan.personafy.model;

import java.time.LocalDate;

public record Extracurricular(
    String name, 
    LocalDate startDate, 
    LocalDate endDate, 
    String role, 
    String description) {
    
}
