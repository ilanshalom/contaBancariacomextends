package entities;

public class Account {
	private Integer number;
	private String Ilan;
	protected Double balace;

	public Account() {

	}

	public Account(Integer number, String ilan, Double balace) {

		this.number = number;
		Ilan = ilan;
		this.balace = balace;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getIlan() {
		return Ilan;
	}

	public void setIlan(String ilan) {
		Ilan = ilan;
	}

	public Double getBalace() {
		return balace;
	}

	public void withdraw(double amount) {
		balace -= amount + 5.0;
	}

	public void deposit(double amount) {
		balace += amount;
	}
}
