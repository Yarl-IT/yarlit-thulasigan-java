import java.util.Scanner;
class StudentsMarksArray{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("How many subjects that you have?   ");
		int n_subjects=scan.nextInt();
		int[] marks=new int[n_subjects];
		int total=0;
		int x=0;
		
		while(x<n_subjects){
			System.out.print("Enter the marks for subject "+(x+1)+": ");
			int mark=scan.nextInt();
			if((mark>100)||(mark<0)){
				System.out.println("Invalid marks. Please try again.");
				continue;
			}else{
				total=total+mark;
			}
				x++;
		}
		double average=(double)total/n_subjects;
		
		System.out.println("Total marks: "+total);
		System.out.println("Total average: "+average);
		
	}
}