import java.util.Scanner;
class SimpleCalculator{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("+-x/)Welcome to ASMD Calculator(/x-+");
		System.out.print("Enter the first number: ");
		int num1=scan.nextInt();
		System.out.print("Enter the second number: ");
		int num2=scan.nextInt();
		double total = 0;
		int choice = 0;
		while (true){
			System.out.println("Choose operation:");
			System.out.println("1. Addition(+)");
			System.out.println("2. Substraction(-)");
			System.out.println("3. Multiplication(x)");
			System.out.println("4. Division(/)");
			
			System.out.print("Enter your choice: ");
			choice=scan.nextInt();
			switch (choice){
				case 1:
					total=num1+num2;
					break;
				case 2:
					total=num1-num2;
					break;
				case 3:
					total=num1*num2;
					break;
				case 4:
					if (num2!=0){
						total= (double)num1/num2;
					}
					break;
				default:
					System.out.println("Invalid choice! Please try again.");
					continue;
			}
			break;
		}
		if (choice==4 && num2==0){
			System.out.println("Undefined");
		}else{
			System.out.println("Answer is : "+total);
		}
		System.out.println("Thank you for using our calculator.");
	}
}