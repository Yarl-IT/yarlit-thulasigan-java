import java.util.Scanner;
class InvertedPyramid{
	public static void main(String args[]){
		Scanner cat=new Scanner(System.in);
		System.out.print("Enter the total rows: ");
		int row=cat.nextInt();
		for(int x=row;x>0;x--){
			for(int y=row-x;y!=0;y--){
				System.out.print(" ");
			}
			for(int z=(2*x)-1;z>0;z--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}