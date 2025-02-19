package org.example.expenses_tracker.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;
import java.time.LocalDate;

@Entity
@Data

public class Expense  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private String category;
    private String title;
    private LocalDate date;
    private Integer amount;
}
