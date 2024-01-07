package com.jan.personafy.dto;

import java.time.LocalDate;

public record ExtracurricularDTO (
    String name, 
    LocalDate startDate, 
    LocalDate endDate, 
    String role, 
    String description
)
{
    
}
