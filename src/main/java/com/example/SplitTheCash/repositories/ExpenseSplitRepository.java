package com.example.SplitTheCash.repositories;

import com.example.SplitTheCash.entities.ExpenseSplit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseSplitRepository extends JpaRepository<ExpenseSplit,String> {
    List<ExpenseSplit> findByExpense_id();
    List<ExpenseSplit> findByMember_id();
}
