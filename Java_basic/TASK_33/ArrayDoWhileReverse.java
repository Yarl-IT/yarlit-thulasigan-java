class ArrayDoWhileReverse{
	public static void main(String args[]){
		int[] t={10,20,30,40,50};
		int x=t.length;
		do{
		System.out.println(t[(x-1)]);
			x--;
		}while(x>0);
	}
}