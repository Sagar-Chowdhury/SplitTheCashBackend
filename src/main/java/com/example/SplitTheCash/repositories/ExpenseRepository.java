package com.example.SplitTheCash.repositories;

import com.example.SplitTheCash.entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense,String> {
    List<Expense> findByTrip_id();
    List<Expense> findByPaidBy();
}
