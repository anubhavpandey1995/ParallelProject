package com.cg.wallet.dao;

import java.util.List;

import com.cg.wallet.account.Account;
import com.cg.wallet.account.AccountException;
import com.cg.wallet.account.Transaction;

public interface AccountDao {
	String AccountEntry(Account account );
	
	List<Account> getAllAccount();
	

	List<Transaction> getAllTransaction();

	

	int AccountWithdrawl(String mobileNumber, int w) throws AccountException;

	int AccountDeposit(String mobileNumber, int d) throws AccountException;

	int MoneyTransfer(String mobile1, String mobile2, int amount)
			throws AccountException;

	

	int  showBalance(String mobile) throws AccountException;

}
