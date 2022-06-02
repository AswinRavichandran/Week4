package week4.day1;

public class Bank extends Sbi{

	@Override
	public void bankBalance() {
		System.out.println("BalancenAmount");
		
		
	}

	@Override
	public void maximumLoanAmount() {
		System.out.println("maximumLoanAmount");
		
	}
	
@Override
	public void cibilScore() {
	System.out.println("cibil score");
}

@Override
	public void ITLoan() {
	System.out.println("it loan");
}
	@Override
	public void minimumBalance() {
		System.out.println("minimum balance");
	}
	
	@Override
	public void creditScore() {
		System.out.println("creditScore");
	}
	
	public static void main(String[] args) {
		Sbi obj=new Bank();
		obj.bankBalance();
		obj.cibilScore();
		obj.creditScore();
		obj.ITLoan();
		obj.maximumLoanAmount();
		obj.minimumBalance();
	}
}
