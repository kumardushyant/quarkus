package com.example.service;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.example.entity.Account;

@ApplicationScoped
public class TxrService {

	@Transactional(value = TxType.REQUIRED, rollbackOn = { RuntimeException.class }, dontRollbackOn = {})
	public void doTxr(double amount, String fromAccNum, String toAccNum) {

		Account fromAccount = Account.findById(fromAccNum);
		Account toAccount = Account.findById(toAccNum);

		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

//		Account.update("balance=?1 where num=?2", fromAccount.getBalance(),fromAccount.getNum());
//		Account.update("balance=?1 where num=?2", toAccount.getBalance(),toAccount.getNum());
//		
		
	}

}
