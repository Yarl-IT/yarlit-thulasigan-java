import java.util.Scanner;
class DiamondStarPattern{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.print("How many rows do you want? (Answer might be odd and positive)   ");
			int row1=scan.nextInt();
			int row=(row1-1)/2;
			if ((row1%2==1)&&(row1>0)){
				for(int y=row;y>=-row;y--){
					for(int x=-row;x<=row;x++){
						if((y+x<=row)&&(x>=0)&&(y>=0) || (y-x<=row)&&(x<=0)&&(y>=0) ||(-y+x<=row)&&(x>=0)&&(y<=0) ||(-y-x<=row)&&(x<=0)&&(y<=0)){
							System.out.print("*");
						}else{
							System.out.print(" ");
						}
					}
					System.out.println("");
				}
			}else{
				System.out.println("Invalid value! please try again.");
				continue;
			}
			break;
		}
	}
}