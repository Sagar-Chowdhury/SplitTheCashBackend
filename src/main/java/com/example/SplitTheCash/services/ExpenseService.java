package com.example.SplitTheCash.services;

import com.example.SplitTheCash.entities.Expense;

import java.math.BigDecimal;
import java.util.List;

public interface ExpenseService {
    Expense addExpense(String tripId,Expense expense);
    List<Expense> getExpensesByTrip(String tripId);
    BigDecimal calculateTotalExpense(String tripId);
}
