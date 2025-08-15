package atm;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		AtmoperationImplement atm=new AtmoperationImplement();
		System.out.println("WELCOME TO THE ATM MACHNE");
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("----ATM MENU-----");
			System.out.println("1.view balance");
			System.out.println("2.withdrawAmount");
			System.out.println("3.deposit");
			System.out.println("4.History of transcation ");
			System.out.println("5.exit\n");
			System.out.println("Choose the option from to 1-5:");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				atm.viewbalance();
				break;
			
			case 2:
				System.out.println("Enter the amount for  withdraw:");
				atm.withdrawAmount(sc.nextDouble());
			break;
			case 3:
				System.out.println("Enter the amount for deposit:");
				atm.depositAmount(sc.nextDouble());
			break;
			case 4: 
				atm.viewministatement();
			
			break;
			
				 
			case 5:
				System.out.println("THANK YOU!!\n");
				break;
		}
			
		
		
		
		}	

}
}

	
