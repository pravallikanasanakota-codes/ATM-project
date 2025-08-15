package atm;

import java.util.ArrayList;
import java.util.List;

public class AtmoperationImplement implements AtmoperationInterface {
private  double viewbalance=0;
private List<String> History= new ArrayList<>();
	public void viewbalance() {
		System.out.println("Balance in your accouunt:" + viewbalance);
		
	}


	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount<=viewbalance) {
		viewbalance=viewbalance-withdrawAmount;
		History.add("withdrawnAmount is:" + withdrawAmount);
		System.out.println(withdrawAmount + " withdrwaAmount is sucessfully\n");
	}
	else {
		System.out.println("Insufficent balance");
	}
}


	public void depositAmount(double depositAmount) {
		viewbalance=viewbalance+depositAmount;
		History.add("depositedAmount is:" + depositAmount);
		System.out.println(depositAmount + " depositAmount Succesfully\n");
		
	}

	
	public void viewministatement() {
		System.out.println("Transaction history\n");
		for(String transcation: History) {
			System.out.println(transcation);
		}
		
		
	}

}
