import java.util.Scanner;
class GradeCalculator{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("How many subjects do you have?   ");
		int a_subjects=scan.nextInt();
		int[] unit=new int[a_subjects];
		int score;
		int total=0;
		double average=0;
		
		for(int z=0;z<a_subjects;z++){
			while(true){
				System.out.print("Enter the marks of subject "+(z+1)+": ");
				score=scan.nextInt();
				if((score>100)||(score<0)){
					System.out.println("Invalid marks! Please try again.");
					continue;
				}else{
					unit[z]=score;
					total=total+score;
					average=(double)total/a_subjects;
				}
				break;
			}
		}
		if(average>=75){
			System.out.println("Grade: A");
		}else if(average>=65){
			System.out.println("Grade: B");
		}else if(average>=50){
			System.out.println("Grade: C");
		}else if(average>=35){
			System.out.println("Grade: S");
		}else{
			System.out.println("Grade: W");
		}
	}
}