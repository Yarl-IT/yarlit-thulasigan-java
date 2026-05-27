class PrimitiveDataTypes{
	public static void main(String args[]){
		Byte b;
		b=127;
		System.out.println("byte: "+b);
		
		Short s;
		s=1234;
		System.out.println("short: "+s);
				
		int i;
		i=81111;
		System.out.println("integer: "+i);
		
		long l;
		l=1111234321111111L;
		System.out.println("Long: "+l);
		
		float f;
		f=129.2f;
		System.out.println("float: "+f);
		
		double D;
		D=23.34D;
		System.out.println("double: "+D);
		
		boolean bool;
		bool=true;
		System.out.println("boolean: "+bool);
		System.out.println("!boolean: "+!bool);
		System.out.println("bo*!bo: "+((bool)&&(!bool)));
		System.out.println("bo+!bo: "+((bool)||(!bool)));
	
		char ch,ch1,ch2,ch3,ch4,ch5;
		ch='A';
		ch1=65;	//decimal value
		ch2=0101;	//octal value
		ch3=0x41;	//hexa decimal value
		ch4=0b1000001;	//binary value
		ch5='\u0041'; //unicode value
		System.out.println("char: "+ch);
		System.out.println("char: "+ch1);
		System.out.println("char: "+ch2);
		System.out.println("char: "+ch3);
		System.out.println("char: "+ch4);
		System.out.println("char: "+ch5);
	}
}