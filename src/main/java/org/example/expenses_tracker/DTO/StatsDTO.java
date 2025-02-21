package org.example.expenses_tracker.DTO;

import lombok.Data;
import org.example.expenses_tracker.entity.Expense;
import org.example.expenses_tracker.entity.Income;

@Data
public class StatsDTO {
    private Double income;
    private Double expenses;

    private Income latestIncome;
    private Expense latestExpense;

    private Double balance;
    private Double minIncome;
    private Double maxIncome;
    private Double minExpense;
    private Double maxExpense;
}
