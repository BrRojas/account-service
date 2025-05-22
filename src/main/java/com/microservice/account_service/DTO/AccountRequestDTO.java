package com.microservice.account_service.DTO;

import com.microservice.account_service.util.Type;

import java.math.BigDecimal;

public class AccountRequestDTO {

    private Type accountType;
    private Long userId;
    private BigDecimal initialDeposit;  // para iniciar balance

    public BigDecimal getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(BigDecimal initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Type getAccountType() {
        return accountType;
    }

    public void setAccountType(Type accountType) {
        this.accountType = accountType;
    }
}
