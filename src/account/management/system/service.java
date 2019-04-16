package account.management.system;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class service {
	public static void main(String[] args) {
		addToMap("john", "johnson", "1");
		addToMap("tj", "john", "3");
		getFromMap(1);
		Gson gson = new Gson();
		String json = gson.toJson(accountmap);
		System.out.println(json);
		
		
		
		
	
	}
	static HashMap<Integer, Account>accountmap = new HashMap<>();
	
	static int count = 0;
	
	public static void addToMap(String firstName, String lastName, String accountNumber){
	   Account account = new Account(firstName, lastName, accountNumber);
	   accountmap.put(count, account);
	   count ++;
	  
	}
	
	public static void getFromMap(Integer key) {
		System.out.println(accountmap);
		
	}

}
