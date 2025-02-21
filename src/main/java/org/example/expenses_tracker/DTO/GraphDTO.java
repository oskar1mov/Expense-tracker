package org.example.expenses_tracker.DTO;

import lombok.Data;
import org.example.expenses_tracker.entity.Expense;
import org.example.expenses_tracker.entity.Income;


import java.util.List;

@Data
public class GraphDTO {
    private List<Expense> expenseList;
    private List<Income> incomeList;
}
