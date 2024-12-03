package com.example.SplitTheCash.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private String description;
    private Double amount;
    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip; // many expense one trip
    @ManyToOne
    @JoinColumn(name = "paid_by")
    private Member paidBy; // many expense one member who paid
}
