package com.microservice.account_service.model;

import com.microservice.account_service.util.Status;
import com.microservice.account_service.util.Type;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,nullable = false)
    private String numAccount;

    @Column(nullable = false)
    private BigDecimal balance = BigDecimal.ZERO;

    @Enumerated(EnumType.STRING)
    private Type typeAccount;

    @Enumerated(EnumType.STRING)
    private Status state;


    private LocalDateTime createdAt = LocalDateTime.now();

    private Long userId;


    public Account() {
    }

    public Account(Long id, String numAccount, BigDecimal balance, Type typeAccount, Status state, LocalDateTime createdAt, Long userId) {
        this.id = id;
        this.numAccount = numAccount;
        this.balance = balance;
        this.typeAccount = typeAccount;
        this.state = state;
        this.createdAt = createdAt;
        this.userId = userId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(String numAccount) {
        this.numAccount = numAccount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Type getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(Type typeAccount) {
        this.typeAccount = typeAccount;
    }

    public Status getState() {
        return state;
    }

    public void setState(Status state) {
        this.state = state;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
