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

    /**
     *
     * @param customerDto - CustomerDto object to be updated
     * @return boolean indicating if the update of account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}

