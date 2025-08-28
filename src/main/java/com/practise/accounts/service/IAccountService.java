package com.practise.accounts.service;

import com.practise.accounts.dto.CustomerDto;
import com.practise.accounts.entity.Customer;

public interface IAccountService {
    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile number
     * @return CustomerDto - Account details based on a given mobileNumber
     */
    CustomerDto fetchAccountDetails(String mobileNumber);
}

