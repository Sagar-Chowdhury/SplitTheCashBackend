package com.example.SplitTheCash.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @OneToMany(mappedBy = "paidBy")
    private List<Expense> expensesPaid; // Member paying for expenses
    @ManyToMany(mappedBy = "members")
    private List<Trip> trips; // Member's trips (via mapping table)
}
