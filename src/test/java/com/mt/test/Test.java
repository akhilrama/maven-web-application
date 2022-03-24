package com.mt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.mt.pojo.BankAccount;

public class Test {

	@org.junit.jupiter.api.Test
	public void testFunds() {
	       BankAccount account = new BankAccount(10);
	       double amount = account.debit(5);
	       assertEquals(5.0, amount);
	    }

}