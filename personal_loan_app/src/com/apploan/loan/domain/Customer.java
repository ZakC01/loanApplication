package com.apploan.loan.domain;

//create the Customer class with the attributes customerId, customerName, age, gender LoanApplication and the constructor,getters and setters  and the inner class CustomerBuilder

public  class Customer {

    private String customerId;
    private String customerName;
    private int age;

    private  String gender;

    private LoanApplication loanApplication;

    public Customer() {
    }

    public Customer(CustomerBuilder builder) {
        this.customerId = builder.customerId;
        this.customerName = builder.customerName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.loanApplication = builder.loanApplication;
    }

    public String getCustomerId() {
        return customerId;
    }


    public String getCustomerName() {
        return customerName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public LoanApplication getLoanApplication() {
        return loanApplication;
    }
    public static class CustomerBuilder {
        private String customerId;
        private String customerName;
        private int age;
        private String gender;
        private LoanApplication loanApplication;

        public CustomerBuilder(String customerId, String customerName,int age, String gender) {
            this.customerId = customerId;
            this.customerName = customerName;
            this.age=age;
            this.gender = gender;        }

        public CustomerBuilder loanApplication(LoanApplication loanApplication) {
            this.loanApplication = loanApplication;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}






