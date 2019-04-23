class Lab2Task5{
	public static void main(String args[]){
		byte a=7;
 		byte b=3;
 		int c= a ^ b ;
 		int e;
 		e= ~c;
 		System.out.println("A:"+a+" "+"B:"+b);
 		System.out.println("A & B: "+(a & b));
 		System.out.println("A | B: "+(a | b));
 		System.out.println(" A ^ B:"+c);
 		System.out.println("~C: "+e);
 		System.out.println("C>>2"+(c>>2));
 		System.out.println("C<<2"+(c<<2));
 		System.out.println("C>>>2"+(c>>>2));

	}
}