import java.util.Scanner;
class LargestNumber{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int f_number=scan.nextInt();
		System.out.print("Enter the second number: ");
		int s_number=scan.nextInt();
		System.out.print("Enter the third number: ");
		int t_number=scan.nextInt();
		
		if ((f_number>=s_number)&&(f_number>=t_number)){
			System.out.println("Largest number is "+f_number);
		}else if ((s_number>=f_number)&&(s_number>=t_number)){
			System.out.println("Largest number is "+s_number);
		}else{
			System.out.println("Largest number is "+t_number);
		}
	}
}