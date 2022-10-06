package com.robert.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.robert.savetravels.model.Expense;
import com.robert.savetravels.repository.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
	public List<Expense> allExpenses(){
		return expenseRepository.findAll();
    }
    // creates a whatever
    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }
    // retrieves a whatever
    public Expense findExpense(Long id) {
        Optional<Expense> optionalBook = expenseRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    // updates a whatever
    public Expense updateExpense(Expense expense) {
    	return expenseRepository.save(expense);
    }
    // Deletes one by id
    public void deleteBook(Long id) {
    	expenseRepository.deleteById(id);
    }
}