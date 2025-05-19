package com.microservice.account_service.service;

import com.microservice.account_service.DTO.AccountRequestDTO;
import com.microservice.account_service.model.Account;
import com.microservice.account_service.util.Status;
import com.microservice.account_service.util.Type;

import java.math.BigDecimal;

public class AccountServiceImpl implements AccountService{


    @Override
    public Account saveAccount(AccountRequestDTO accountRequestDTO) {
        return null;
    }

    @Override
    public Account findById(Long id) {
        return null;
    }

    @Override
    public Account updateAccountStatus(Long id, Status newStatus) {
        return null;
    }

    @Override
    public Account updateAccountType(Long id, Type newType) {
        return null;
    }

    @Override
    public void deposit(Long accountId, BigDecimal amount) {

    }

    @Override
    public void withdraw(Long accountId, BigDecimal amount) {

    }
}
