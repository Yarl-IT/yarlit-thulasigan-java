import java.util.Scanner;
class electricity_bill{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your Electricity units: ");
		double unit=scan.nextDouble();
		double amount;
		
		if (unit>0){
			if(unit<=90){
				amount=unit*7;
			}else if(unit<=150){
				amount=unit*10;
			}else if(unit<=300){
				amount=unit*15;
			}else{
				amount=unit*15*1.03;
				System.out.println("Additional 3% Charge Applied");
			}
			System.out.println("Total bill= Rs."+amount);
		}else{
			System.out.println("Invalid value. Please try again.");
		}
	}
}