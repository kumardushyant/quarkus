package com.example.web;

import javax.json.bind.annotation.JsonbProperty;

public class TxrRequest {

	@JsonbProperty(value = "from-account-number")
	private String fromAccountNumber;
	@JsonbProperty(value = "to-account-number")
	private String toAccountNumber;
	private double amount;

	public String getFromAccountNumber() {
		return fromAccountNumber;
	}

	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}

	public String getToAccountNumber() {
		return toAccountNumber;
	}

	public void setToAccountNumber(String toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
