package p1;

public class A {

	// class-members ( we can use access-specifers )
	// -----------------------------------------------

	// 1. variables

	public static int pubSta = 0;

	private int pri = 1;
	int de = 2;
	protected int pro = 3;
	public int pub = 4;

	// 2. constructors

	// 3. methods

	public void aMethod() {
		
		System.out.println(pubSta);
		
		System.out.println(pri);
		System.out.println(de);
		System.out.println(pro);
		System.out.println(pub);
		
	}
	
	// 4. inner classes

}
