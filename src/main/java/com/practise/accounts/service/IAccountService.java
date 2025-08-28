package com.practise.accounts.service;

import com.practise.accounts.dto.CustomerDto;
import com.practise.accounts.entity.Customer;

public interface IAccountService {
    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
}
