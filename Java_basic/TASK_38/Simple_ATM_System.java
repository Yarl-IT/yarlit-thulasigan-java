import java.util.Scanner;
class Simple_ATM_System{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int balance=10000;
		String repeat="Y";
			// This is Bank of Any Time ATM Software
		System.out.println("Welcome to BOAT ATM");
		do{
			System.out.println("--- ATM MENU ---");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.print("Choose Option: ");
			int num=scan.nextInt();
			switch (num){
				case 1:
					System.out.println("Your Balance: "+balance);
					break;
				case 2:
					while(true){
						System.out.print("Enter Your Deposit Amount: ");
						int d_amount=scan.nextInt();
						if (d_amount>0){
							balance=balance+d_amount;
						}else{
							System.out.println("Invalid amount for deposit! Please try again.");
							continue;
						}
						System.out.println("Updated Balance: "+balance);
						break;
					}
					break;
				case 3:
					while(true){
						System.out.print("Enter Your Withdraw Amount: ");
						int w_amount=scan.nextInt();
						if (w_amount>balance){
							System.out.println("Unable to withdraw! Please try again.");
							System.out.println("Your Balance is: "+balance);
							continue;
						}else if(w_amount<0){
							System.out.println("Invalid Withdrawal amount! Please try again.");
							continue;
						}else{
							balance=balance-w_amount;
							System.out.println("Updated Balance: "+balance);
							break;
						}
					}
					break;
				default:
					System.out.println("Invalid option number! Please try again.");
					continue;
			} 
			while (true){       
				System.out.print("Do you want another operation? (Y/N) : ");
				repeat=scan.next();    
				if (repeat.equals("Y") || repeat.equals("N")){
					break;
				}else{
					System.out.println("Invalid operational letter! Please try again.");
					continue;
				}
			}
		}while(repeat.equalsIgnoreCase("Y"));
		System.out.println("Thank you! Have a nice day.");
	}
}