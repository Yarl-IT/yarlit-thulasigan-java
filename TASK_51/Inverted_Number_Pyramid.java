import java.util.Scanner;
class Inverted_Number_Pyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("How many rows do you want?   ");
		int row=scan.nextInt();
		for(int x=1;x<=row;x++){
			for(int y=1;y<x;y++){
				System.out.print("  ");
			}
			for(int z=0;z<=(row-x);z++){
				System.out.print((z+1)+" ");
			}
			System.out.println("");
		}
	}
}