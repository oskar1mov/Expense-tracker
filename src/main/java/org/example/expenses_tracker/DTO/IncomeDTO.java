package org.example.expenses_tracker.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class IncomeDTO {
    private Long id;
    private String title;
    private Integer amount;
    private LocalDate date;
    private String Category;
    private String description;
}
