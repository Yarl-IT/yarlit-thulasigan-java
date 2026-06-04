class ArrayDoWhileForward{
	public static void main(String args[]){
		int[] q={10,20,30,40,50};
		int x=0;
		do{
			System.out.println(q[x]);
			x++;
		}while(x<q.length);
	} 
}