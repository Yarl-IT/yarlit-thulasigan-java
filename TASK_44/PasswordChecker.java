import java.util.Scanner;
class PasswordChecker{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		for(int x=2;x>=0;x--){
			System.out.print("Enter the Password: ");
			String password=scan.next(); 
			if(password.equals("@yarlit123")){
				System.out.println("Access granded");
			}else{
				if(x==0){
					System.out.println("Access Blocked");
				}else{
					System.out.println("Wrong password.  Attempts left: "+x);
					continue;
				}
			}
			break;
		}
	}
	
}