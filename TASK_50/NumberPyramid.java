import java.util.Scanner;
class NumberPyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("How many rows do you want?   ");
		int row=scan.nextInt();
		for(int x=1;x<=row;x++){
			for(int y=1;y<=row;y++){
				if(y<=row-x){
					System.out.print("  ");
				}else{
					System.out.print((x+y-row)+" ");
				}
			}
			System.out.println("");
		}
	}
}