class NestedDoWhile{
	public static void main(String args[]){
		int x=1;
		do{
			int y=1;
			do{
				System.out.print(y+",");
				y=y+1;
			}while(y<=3);
			System.out.println(x);
			x++;
		}while(x<=5);
	}
}