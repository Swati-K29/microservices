package com.practise.loans.service;

import com.practise.loans.dto.LoansDto;

public interface ILoansService {
    /**
     *
     * @param mobileNumber - Mobile number of the customer
     */
    void createLoans(String mobileNumber);

    LoansDto fetchLoan(String mobileNumber);

    boolean updateLoan(LoansDto loansDto);

    boolean deleteLoan(String mobileNumber);
}
