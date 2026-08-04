import java.util.Scanner;
class Inverted_Left_Aligned_Star_Pyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("How many rows do you want?   ");
		int row=scan.nextInt();
		for(int x=0;x<=row;x++){
			for(int y=row;y>0;y--){
				if(y<=row-x){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}