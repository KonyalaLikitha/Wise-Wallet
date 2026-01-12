package com.wisewallet.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="budgets")
public class Budget extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double monthlyBudget;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

    // getters & setters
}
