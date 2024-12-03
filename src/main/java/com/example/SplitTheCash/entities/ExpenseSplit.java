package com.example.SplitTheCash.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class ExpenseSplit {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ManyToOne
    @JoinColumn(name="expense_id",nullable = false)
    private Expense expense;
    @ManyToOne
    @JoinColumn(name="member_id", nullable = false)
    private Member member; // Member sharing the expense
    @Column(nullable = false)
    private BigDecimal amount; // Split amount
}
