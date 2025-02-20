package org.example.expenses_tracker.controller;

import lombok.RequiredArgsConstructor;
import org.example.expenses_tracker.DTO.ExpenseDTO;
import org.example.expenses_tracker.entity.Expense;
import org.example.expenses_tracker.services.expense.ExpenseService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expense")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ExpenseController {
    private final ExpenseService expenseService;

    @PostMapping
    public ResponseEntity<?> postExpense(@RequestBody ExpenseDTO dto){
        Expense createdExpense = expenseService.postExpense(dto);
        if(createdExpense != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdExpense);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @GetMapping("/all")
  public ResponseEntity<?> getAllExpenses(){
        return ResponseEntity.ok(expenseService.getAllExpenses());
    }
}
