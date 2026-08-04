import java.util.Scanner;
class StudentMark2D{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n_students=0;
		while(true){	
			System.out.print("How many students are there?   ");
			n_students=scan.nextInt();
			if(n_students<0){
					System.out.println("Invalid value! please try again.");
					continue;
				}
				break;
			}
		int[][] s_marks=new int[n_students][3];
		int[] total=new int[n_students];
		float[] average=new float[n_students];
		int x=0;
		
		while(x<n_students){
			System.out.println("Enter the marks for student "+(x+1));
			while(true){	
				System.out.print("ICT   : ");
				s_marks[x][0]=scan.nextInt();
				if((s_marks[x][0]<0)||(s_marks[x][0]>100)){
					System.out.println("Invalid value! please try again.");
					continue;
				}
				break;
			}
			while(true){	
				System.out.print("Maths : ");
				s_marks[x][1]=scan.nextInt();
			if((s_marks[x][1]<0)||(s_marks[x][1]>100)){
					System.out.println("Invalid value! please try again.");
					continue;
				}
				break;
			}
			while(true){	
				System.out.print("Tamil : ");
				s_marks[x][2]=scan.nextInt();
			if((s_marks[x][2]<0)||(s_marks[x][2]>100)){
					System.out.println("Invalid value! please try again.");
					continue;
				}
				break;
			}			
			total[x]=s_marks[x][0]+s_marks[x][1]+s_marks[x][2];
			average[x]=(float)total[x]/3;
			x++;
			System.out.println();
		}
		System.out.printf("%-15s%-10s%-10s%-10s%-15s%-15s%n","Student","ICT","Maths","Tamil","Total","Average");
		x=0;
		while(x<n_students){
			System.out.printf("%-15s%-10d%-10d%-10d%-15d%-15.6f%n","S"+(x+1),s_marks[x][0],s_marks[x][1],s_marks[x][2],total[x],average[x]);
			x++;
		}
	}
}
