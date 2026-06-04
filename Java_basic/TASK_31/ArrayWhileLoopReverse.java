class ArrayWhileLoopReverse{
	public static void main(String args[]){
		int[] y;
		y= new int[5];
		y[0]=10;
		y[1]=20;
		y[2]=30;
		y[3]=40;
		y[4]=50;
		
		int x=y.length;
		while (x>0){
			System.out.println(y[(x-1)]);
			x--;
		}
		
	}
}