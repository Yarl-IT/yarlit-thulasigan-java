class OperatorCombination{
	public static void main(String args[]){
		int a=10,b=3,c=5;
		
		a=b++ + c++;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		
		c=b=a;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		
		b=a-- + --b - c++;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
	}
}