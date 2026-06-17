import java.util.Scanner;
class ShoppingBill{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int items=0;
		while(true){
			System.out.print("Enter the number of items that you have: ");
			items=scan.nextInt();
			if(items<=0){
				continue;
			}
			break;
		}
		
		int[] item=new int[items];
		double total=0;
		double price=0;
		double quantity=0;
		
		for(int x=0;x<item.length;x++){
			while(true){
				System.out.print("Enter the unit price of item "+(x+1)+" : ");
				price=scan.nextDouble();
				if(price<=0){
					System.out.println("Invalid price! Please try again.");
					continue;
				}
				break;
			}
			
			while(true){
				System.out.print("Enter the quantity : ");
				quantity=scan.nextDouble();
				if(quantity<=0){
					System.out.println("Invalid quantity! Please try again.");
					continue;
				}
				break;
			}
			
			total=total+(price*quantity);
		}
		
		if (total>=5000){
			System.out.println("Discount applied(10%)");
			System.out.println("Total Bill Amount : "+(total*0.9));
		}else{
			System.out.println("Total Bill Amount : "+total);
		}
	}
}