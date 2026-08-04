import java.util.Scanner;
class SearchArray{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int[] t={12,65,56,93,87,9,74,78,74,70,32,49,56,23};
		int y=0;
		System.out.print("Enter the number to search: ");
		int num=scan.nextInt();
		
		for(int x=0;x<t.length;x++){
			if (t[x]==num){
				y++;
				if(y==1){
					System.out.print("Element found at index : "+x);
				}else{
					System.out.print(","+x);
				}
			}else{
				if ((x==t.length-1)&&(y==0)){
					System.out.println("Sorry! No element found.");
				}
			}
		}
		
	}
}