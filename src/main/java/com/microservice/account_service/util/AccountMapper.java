package com.microservice.account_service.util;

import com.microservice.account_service.DTO.AccountRequestDTO;
import com.microservice.account_service.DTO.AccountResponseDTO;
import com.microservice.account_service.model.Account;

public class AccountMapper {

    // Convierte de AccountRequestDTO a entidad Account (para crear)
    public static Account toEntity(AccountRequestDTO dto) {
        Account account = new Account();
        account.setTypeAccount(dto.getAccountType());
        account.setUserId(dto.getUserId());
        account.setBalance(dto.getInitialDeposit());
        return account;
    }

    // Convierte de entidad Account a AccountResponseDTO (para devolver al cliente)
    public static AccountResponseDTO toResponseDTO(Account account) {
        AccountResponseDTO dto = new AccountResponseDTO();
        dto.setId(account.getId());
        dto.setAccountNumber(account.getNumAccount());
        dto.setAccountType(account.getTypeAccount().toString());
        dto.setBalance(account.getBalance());
        dto.setCreatedAt(account.getCreatedAt().toLocalDate());
        dto.setState(account.getState());
        return dto;
    }
