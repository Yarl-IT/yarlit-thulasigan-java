import java.util.Scanner;
class AltNumStarPattern{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int num=0;
		int column=0;
		while(true){
			System.out.print("Enter the rows that you want: ");
			num=scan.nextInt();
			if(num<=0){
				System.out.print("Incorrect amount! Please try again.");
				continue;
			}
			break;
		}
		
		while(true){
			System.out.print("Enter the rows that you want: ");
			column=scan.nextInt();
			if(column<=0){
				System.out.print("Incorrect amount! Please try again.");
				continue;
			}
			break;
		}	
		
		for(int x=1;x<=num;x++){
			for(int y=0;y<column;y++){
				if(x%2==1){
					System.out.print(x);
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}