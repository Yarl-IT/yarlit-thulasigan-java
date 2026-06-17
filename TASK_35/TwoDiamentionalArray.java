class TwoDiamentionalArray{
	public static void main(String args[]){
		int[][] q;
		q=new int[5][2];
		q[0][0]=10;
		q[0][1]=20;
		q[1][0]=30;
		q[1][1]=40;
		q[2][0]=50;
		q[2][1]=60;
		q[3][0]=70;
		q[3][1]=80;
		q[4][0]=90;
		q[4][1]=100;
		
		for (int x=0;x<q.length;x++){
			for(int y=0;y<q[0].length;y++){		//q[0].length=q[1].length=q[2].length=.......
				System.out.println(q[x][y]);
			}
				System.out.println("");
		}
	}
}