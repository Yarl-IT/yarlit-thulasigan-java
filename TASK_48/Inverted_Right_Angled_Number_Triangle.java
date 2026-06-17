import java.util.Scanner;
class Inverted_Right_Angled_Number_Triangle{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("How many rows do you want?   ");
		int row=scan.nextInt();
		for(int x=row;x>0;x--){
			for(int y=1;y<=x;y++){
				System.out.print(y+" ");
			}
			System.out.println("");
		}
	}
}