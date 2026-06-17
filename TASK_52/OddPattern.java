import java.util.Scanner;
class OddPattern{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int num=0;
		int row=0;
		while(true){
			System.out.print("Enter the columns that you want: ");
			num=scan.nextInt();
			if(num<=0){
				System.out.print("Incorrect amount! Please try again.");
				continue;
			}
			break;
		}
		
		while(true){
			System.out.print("Enter the rows that you want: ");
			row=scan.nextInt();
			if(row<=0){
				System.out.print("Incorrect amount! Please try again.");
				continue;
			}
			break;
		}
		
		for(int y=1;y<=row;y++){
			for(int x=1;x<=num;x++){
				if(x%2==0){
					System.out.print("*");
				}else{
					System.out.print(x);
				}
			}
			System.out.println("");
		}
	}
}