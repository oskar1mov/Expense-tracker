package org.example.expenses_tracker.services.expense;

import org.example.expenses_tracker.DTO.ExpenseDTO;
import org.example.expenses_tracker.entity.Expense;

import java.util.List;

public interface ExpenseService {

    Expense postExpense(ExpenseDTO expenseDTO);

    List<Expense> getAllExpenses();
}
