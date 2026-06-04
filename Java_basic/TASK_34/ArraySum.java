import java.util.Scanner;
class ArraySum{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 5 numbers to add:");
		int[] n;
		n=new int[5];
		int sum=0;
		for (int x=0;x<5;x++){
			n[x]= scan.nextInt();
			sum=n[x]+sum;
		}
		System.out.println("sum="+sum);
	}
}