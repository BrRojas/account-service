package com.microservice.account_service.service;

import com.microservice.account_service.DTO.AccountDTO;
import com.microservice.account_service.model.Account;
import com.microservice.account_service.util.Status;
import com.microservice.account_service.util.Type;

import java.math.BigDecimal;

public interface AccountService {

    //Creación

    Account saveAccount(AccountDTO accountDTO);

    //Consulta

    Account findById(Long id);


    // Actualización (PUT/PATCH)

    Account updateAccountStatus(Long id, Status newStatus);

    Account updateAccountType(Long id, Type newType);


    //Operaciones financieras

    void deposit(Long accountId, BigDecimal amount);

    void withdraw(Long accountId, BigDecimal amount);

    //void transfer(Long fromAccountId, Long toAccountId, BigDecimal amount);


}
