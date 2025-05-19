package com.microservice.account_service.DTO;

import com.microservice.account_service.util.Type;

import java.math.BigDecimal;

public class AccountRequestDTO {

    private Type accountType;
    private Long userId;
    private BigDecimal initialDeposit;  // para iniciar balance
}
