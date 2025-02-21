package org.example.expenses_tracker.controller;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.example.expenses_tracker.DTO.IncomeDTO;
import org.example.expenses_tracker.entity.Income;
import org.example.expenses_tracker.services.income.IncomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/income")
@RequiredArgsConstructor
@CrossOrigin("*")

public class IncomeController {
  private final IncomeService incomeService;

  @PostMapping
  public ResponseEntity<?> postIncome(@RequestBody IncomeDTO dto){
      Income createdIncome = incomeService.postIncome(dto);
      if(createdIncome != null){
          return ResponseEntity.status(HttpStatus.CREATED).body(createdIncome);
      }else{
          return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
      }
  }

  @GetMapping("/all")
  public ResponseEntity<?> getAllIncome() {
      return ResponseEntity.ok(incomeService.getAllIncomes());
  }

    @GetMapping("/{id}")
    public ResponseEntity<?> getIncomeById(@PathVariable Long id){
        try{
            return ResponseEntity.ok(incomeService.getIncomeById(id));
        } catch (EntityNotFoundException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }

    @PutMapping ("/{id}")
    public ResponseEntity<?> updateIncome(@PathVariable Long id, @RequestBody IncomeDTO dto){
        try {
            return ResponseEntity.ok(incomeService.updateIncome(id, dto));
        } catch (EntityNotFoundException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteIncome(@PathVariable Long id){
        try {
            incomeService.deleteIncome(id);
            return ResponseEntity.ok(null);
        } catch (EntityNotFoundException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }

}
