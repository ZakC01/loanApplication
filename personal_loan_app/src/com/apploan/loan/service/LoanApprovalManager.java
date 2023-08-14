package com.apploan.loan.service;

//create the singleton class LoanApprovalManager with the method approveLoan which takes Customer as the parameter and returns boolean

import com.apploan.loan.domain.Customer;

public class LoanApprovalManager {
    private static LoanApprovalManager instance;
    // Private constructor to prevent external instantiation
    private LoanApprovalManager() {

    }
    /*Singleton design pattern*/
    public static LoanApprovalManager getInstance() {
        if (instance == null) {
            synchronized (LoanApprovalManager.class) {
                if (instance == null) {
                    instance = new LoanApprovalManager();
                }
            }
        }
        return instance;
    }

    public boolean approveLoan(Customer customer) {
        /*Approve loan if:
        * Customer age is between 18 and 50, and
        * Credit score is above 8, and
        * Loan amount is between 200,000 and 500,0000*/
        if(customer.getAge()>=18 && customer.getAge()<50 && customer.getLoanApplication().getCreditScore()>=8&&customer.getLoanApplication().getLoanAmountinLacs()>=200000 && customer.getLoanApplication().getLoanAmountinLacs()<=500000) {
            return true;
        }
        else return false;
    }
}