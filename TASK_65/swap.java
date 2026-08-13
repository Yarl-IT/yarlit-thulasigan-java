import java.util.Scanner;
class Swap{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the value of x:");
		int x=scan.nextInt();
		System.out.print("Enter the value of y:");
		int y=scan.nextInt();
		
		System.out.println("Before swapping x="+x+" y="+y);
		int z=x;
		x=y;
		y=z;
		System.out.println("After swapping x="+x+" y="+y);
	}
}