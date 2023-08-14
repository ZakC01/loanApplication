package com.apploan.loan.service;

import com.apploan.loan.domain.Customer;

public class LoanManager {
    public boolean processLoan(Customer customer){
        LoanApprovalManager loanApprover=LoanApprovalManager.getInstance();
        return loanApprover.approveLoan(customer);
    }
}
