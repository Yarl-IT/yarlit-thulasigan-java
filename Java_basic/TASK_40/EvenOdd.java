import java.util.Scanner;
class EvenOdd{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=scan.nextInt();
		
		if(num%2==0){
			System.out.println("Number is Even");
		}else{
			System.out.println("Number is Odd");
		}
	}
}