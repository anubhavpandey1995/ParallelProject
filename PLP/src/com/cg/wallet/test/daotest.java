package com.cg.wallet.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.wallet.account.Account;
import com.cg.wallet.account.AccountException;
import com.cg.wallet.dao.AccountDao;
import com.cg.wallet.dao.AccountDaoImpl;

public class daotest {
	AccountDao adao=new AccountDaoImpl();
	Account a1=new Account("Anubhav","9712354883",5000);
	

	@Test
	public void test(){
	adao.AccountEntry(a1);
	try {
		assertEquals(5500,adao.AccountDeposit(a1.getNumber(), 500));
	} catch (AccountException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	}

}
