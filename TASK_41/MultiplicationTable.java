import java.util.Scanner;
class MultiplicationTable{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Which multiplication table do you want?  ");
		int number=scan.nextInt();
		for(int x=1;x<=10;x++){
			System.out.println(number+" x "+x+" = "+(number*x));
		}
	}
}