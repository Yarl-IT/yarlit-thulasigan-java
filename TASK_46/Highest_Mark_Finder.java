import java.util.Scanner;
class Highest_Mark_Finder{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int t_marks=0;
		while(true){
			System.out.print("Enter the number marks that you have: ");
			t_marks=scan.nextInt();
			if (t_marks<=0){
				System.out.println("Invalid number of marks! Please try again");
				continue;
			}
			break;
		}
		int[] array=new int[t_marks];
		int huge=0;
		int z=0;
		while(z<t_marks){
			System.out.print("Enter the marks "+(z+1)+": ");
			int marks=scan.nextInt();
			if ((marks>100)||(marks<0)){
				System.out.println("Invalid marks! Please try again");
				continue;
			}
			array[z]=marks;
			
			if(huge<marks){
				huge=marks;
			}
			z++;
		}
		System.out.println();
		System.out.println("Highest Marks is: "+huge);
	}
}