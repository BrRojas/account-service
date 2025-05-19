package com.microservice.account_service.DTO;

import com.microservice.account_service.util.Status;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AccountResponseDTO {

    private Long id;
    private String accountNumber;
    private String accountType;
    private BigDecimal balance;
    private LocalDate createdAt;
    private Status state;
}
