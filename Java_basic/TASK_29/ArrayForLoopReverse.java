class ArrayForLoopReverse{
	public static void main(String args[]){
		int[] x={10,20,30,40,50};
		for (int y=x.length;y>0;y--){
			System.out.println(x[(y-1)]);
		}
	}
}