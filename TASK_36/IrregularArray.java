class IrregularArray {
	public static void main(String args[]){
		int x[][]=new int[4][];
		
		x[0]=new int[3];
		x[1]=new int[4];
		x[2]=new int[2];
		x[3]=new int[1];
		
		x[0][0]=10;
		x[0][1]=20;
		x[0][2]=30;
		
		x[1][0]=40;
		x[1][1]=50;
		x[1][2]=60;
		x[1][3]=70;
		
		x[2][0]=80;
		x[2][1]=90;
		
		x[3][0]=100;
		
		for (int y=0;y<x.length;y++){
			System.out.println("Student "+(y+1));
			for (int z=0;z<x[y].length;z++){
				System.out.println("Marks "+(z+1)+" : "+x[y][z]);
			}
			System.out.println("*********");
		}
	}
}