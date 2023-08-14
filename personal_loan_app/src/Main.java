import com.apploan.loan.domain.Customer;
import com.apploan.loan.domain.LoanApplication;
import com.apploan.loan.service.LoanManager;

public class Main {
    public static void main(String[] args) {
     //build the loan application
        LoanApplication loanApplication = new LoanApplication.LoanApplicationBuilder("App123", 200000,10,8)
                    .build();
        //build the customer
        Customer customer= new Customer.CustomerBuilder("1", "John", 85, "Male")
                .loanApplication(loanApplication)
                .build();

        //call the processLoan() method of LoanManager passing Customer object
        LoanManager loanManager = new LoanManager();
        boolean approvalResult=loanManager.processLoan(customer);

        //print out the loan application result: Approved/Unapproved
        if(approvalResult)
            System.out.println("Congratulations! Your loan application has been approved");
        else
            System.out.println("Sorry! Your loan application has been rejected");

    }
}