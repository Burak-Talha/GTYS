import dataAccess.concretes.CustomerManager;

import dataAccess.concretes.*;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager manager = new CustomerManager(new SchoolManager());
		
		manager.Create();

	}

}
