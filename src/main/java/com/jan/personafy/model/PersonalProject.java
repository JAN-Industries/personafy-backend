package com.jan.personafy.model;

import java.time.LocalDate;

public record PersonalProject(
    String name, 
    LocalDate startDate, 
    LocalDate endDate, 
    String role, 
    String description) {
} 