import java.util.Scanner;
class ternary_operator{
	public static void main(String args[]){
		Scanner scan=new Scanner (System.in);
		System.out.print("Enter your marks:");
		int marks=scan.nextInt();
		
		String result;
		result=(marks>=50)?"Pass":"Fail";
		System.out.println("Your result is "+result);
		
	}
}