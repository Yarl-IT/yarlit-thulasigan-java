import java.util.Scanner;
class LoginSystem{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the user name: ");
		String UName=scan.next();
		System.out.print("Enter the Password: ");
		String Password=scan.next();
		
		if ((UName.equals("admin")) && (Password.equals("1234"))){
			System.out.println("Login Successful");
		}else{
			System.out.println("Invalid Login");
		}
		
	}
}