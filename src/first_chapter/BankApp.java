package first_chapter;

public class BankApp {

	public static void main(String[] args)
	{
		BankAccount ba1 = new BankAccount(100.00); // create account
		BankAccount ba2 = null;
	
		System.out.println("Understanding Java Principles and Differences from C++");
		System.out.println("------------------------------------------------------");
		
		System.out.print("Before transactions (ba1), ");
		ba1.display(); // display balance
		
		ba1.deposit(74.35); // make deposit
		ba1.withdraw(20.00); // make withdrawal
		
		System.out.print("After transactions (ba1), ");
		ba1.display(); // display balance
		
		// ba2 copies address of ba1 object
		ba2 = ba1;
		System.out.print("Before transactions (ba2), ");
		ba2.display();
		
		ba2.withdraw(41.35); // make withdrawal to ba2
		System.out.print("After withdrawal (ba2), ");
		ba2.display();
		ba1.deposit(10.00); // make deposit to ba1
		System.out.print("After deposit (ba1), ");
		ba2.display();
		ba2.deposit(50.00); // make deposit to ba2
		System.out.print("After deposit (ba2), ");
		ba2.display();
		
		System.out.print("After transactions (ba1), ");
		ba1.display();
	
		if (ba1.equals(ba2)) // comparison of objects
			System.out.println("Objects are equal.");
		
		/*
		 * C++ and Java Differences -> no pointers, more security
		 * ba1 references to the address of the object
		 * ba2 references to ba1's address
		 * both modifies the same object
		 */
				
	} // end main
	
} // end class BankApp
