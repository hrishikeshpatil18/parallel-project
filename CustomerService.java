package service;

import bean.*;
import ui.*;
import dao.*;
public class CustomerService 
{
	AccountDAO acdao=new AccountDAO();
	Account account=new Account();
	double bal;
	
	/*public void createAccount(long ac,Account a)
	{
		acdao.storeAccountsDetails(ac,a);
	}*/
	
	public Account getAccountService()
	{
		Account a2= acdao.getAccountsDetails();
		return a2;
	}
	

	public void depositeAmount(double amount)
	{
		double bal=account.getBalance();
		bal=bal+amount;
		account.setBalance(bal);
	}
	public void withdrawAmount()
	{
		
	}

	public void createAccount(long ac, Account a) {
		// TODO Auto-generated method stub
		acdao.storeAccountsDetails(ac,a);
	}
}
