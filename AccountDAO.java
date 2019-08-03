package dao;


import java.util.HashMap;


import bean.*;
public class AccountDAO 
{
	static HashMap <Long,Account>hash=new HashMap<Long,Account>();
	
	public void storeAccountsDetails(long ac,Account account1)
	{
		hash.put(ac, account1);
		System.out.println("Account created Successfully...!!");
		System.out.println(hash);
		
	}
	
	public Account getAccountsDetails()
	{
		System.out.println(hash.get(0));
		return  hash.get(0);
		
	}
	
}
