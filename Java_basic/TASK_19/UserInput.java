import java.util.Scanner;
class user_input{
	public static void main(String args[]){
		Scanner scan= new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name=scan.next();
		System.out.println("Your name is "+name);
		
		System.out.println("***************");
		
		int marks=0;
		System.out.print("Please enter your marks: ");
		marks=scan.nextInt();
		System.out.println("Your marks is "+marks);
		
	}
}