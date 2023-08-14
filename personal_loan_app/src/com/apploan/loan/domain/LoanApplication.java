package com.apploan.loan.domain;

//create the LoanApplication class with the atrributes applicationId,loanAmountinLacs,tenureInYears,creditScore and the constructor,getters and setters  and the inner class LoanApplicationBuilder

public class LoanApplication {

    private String applicationId;
    private double loanAmountinLacs;
    private float tenureInYears;
    private float creditScore;

    public LoanApplication() {
    }

    public LoanApplication(LoanApplicationBuilder builder) {
        this.applicationId = builder.applicationId;
        this.loanAmountinLacs = builder.loanAmountinLacs;
        this.tenureInYears = builder.tenureInYears;
        this.creditScore = builder.creditScore;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public double getLoanAmountinLacs() {
        return loanAmountinLacs;
    }

     public float getTenureInYears() {
        return tenureInYears;
    }
    public float getCreditScore() {
        return creditScore;
    }
    public static class LoanApplicationBuilder {
        private String applicationId;
        private double loanAmountinLacs;
        private float tenureInYears;
        private float creditScore;

        public LoanApplicationBuilder(String applicationId, double loanAmountinLacs, float tenureInYears, float creditScore) {
            this.applicationId = applicationId;
            this.loanAmountinLacs = loanAmountinLacs;
            this.tenureInYears = tenureInYears;
            this.creditScore = creditScore;
        }
        public LoanApplication build() {
            return new LoanApplication(this);
        }
    }
}