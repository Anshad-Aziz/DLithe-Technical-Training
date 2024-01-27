package ATM;
import java.util.Scanner;
public class ATM {
	int pin=1234;
	int balance=0;
	Scanner sin=new Scanner(System.in);
	public void run() {
		
		while(true) {
			System.out.println("Enter the pin:");
			int enteredpin=sin.nextInt();
			if(enteredpin==pin) {
				displayMenu();
				int choice=sin.nextInt();
				switch(choice) {
				case 1:
					deposit();
					break;
				case 2:
					withdraw();
					break;
				case 3:
					checkBalance();
					break;
				case 4:
					changePin();
					break;
				case 5:
					System.out.println("Exit>>>>");
					return;
				default:
					System.out.println("Invaild choice Enter the between 1 to 5:");
				}
			}
			else {
				System.out.println("Invaild Pin");
			}
			
			
		}
	}
	private void displayMenu() {
		System.out.println("Choose the operation");
		System.out.println("1: Deposit");
		System.out.println("2:Withdraw");
		System.out.println("3:Balance enquiry");
		System.out.println("4:PIN change");
		System.out.println("5:Exit");
	}
	private void withdraw() {
		System.out.println("Enter the amount to Withdraw:");
		int amount=sin.nextInt();
		if (balance>amount) {
			balance-=amount;
			System.out.println("Withdraw Successfull>>");
		}
		else {
			
			System.out.println("Insufficient balance>>");
		}
	}
	private void deposit() {
		System.out.println("Enter the amount to deposit:");
		int amount=sin.nextInt();
		balance+=amount;
		System.out.println("Deposit successfull>>");
	}
	private void checkBalance() {
		System.out.println("Your Balance is :"+balance);
	}
	private void changePin() {
		System.out.println("Enter the New PIN");
		pin=sin.nextInt();
		System.out.println("Successfully updated PIN ");
	}
	public static void main(String args[]) {
		ATM atm=new ATM();
		atm.run();
	}

}


