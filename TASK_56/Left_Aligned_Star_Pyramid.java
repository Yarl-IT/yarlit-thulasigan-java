import java.util.Scanner;
class Left_Aligned_Star_Pyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("How many rows do you want?   ");
		int row=scan.nextInt();
		for(int x=1;x<=row;x++){
			for(int z=1;z<=(row-x);z++){
				System.out.print("  ");
			}
			for(int y=1;y<x;y++){
				System.out.print("* ");
			}
			System.out.print("* ");
			System.out.println("");
		}
	}
}