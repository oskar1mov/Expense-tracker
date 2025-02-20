package org.example.expenses_tracker.services.income;

import org.example.expenses_tracker.DTO.IncomeDTO;
import org.example.expenses_tracker.entity.Income;

import java.util.List;

public interface IncomeService {
    Income postIncome(IncomeDTO incomeDTO);
    List<Income> getAllIncomes();
    Income getIncomeById(Long id);
    Income updateIncome(Long id, IncomeDTO incomeDTO);
    void deleteIncome(Long id);

}
