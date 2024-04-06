package entities;

public class BusinessAccount extends Account {
	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String ilan, Double balace, Double loanLimit) {
		super(number, ilan, balace);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balace += amount - 10.0;
		}
	}
	@Override
	public void withdraw(double amount) {
	super.withdraw(amount);
	balace -= 2.0;
	}
}