package com.example.SplitTheCash.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    @Column(nullable = false)
    private String title;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    @CreationTimestamp // Automatically sets current timestamp
    private Timestamp createdAt;
    @ManyToMany
    @JoinTable(
            name = "Trip_Members",
            joinColumns = @JoinColumn(name = "trip_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id")
    )
    private List<Expense> expenses;

}
