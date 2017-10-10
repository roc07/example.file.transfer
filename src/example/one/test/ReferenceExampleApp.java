package example.one.test;

public class ReferenceExampleApp {

	static void testAr(int[] zx) {
		zx[1] = 1000;
	}
	
	static void testStr(String s) {
		s = "OK";
	}
	
	static void testObj(Person o) {
		o.x = 2000;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1, 2, 3};
		
		testAr(x);
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		String s = "NOT";
		
		testStr(s);
		
		System.out.println(s);
		
		Person p = new Person();
		testObj(p);
		System.out.println(p.x);
		
	}

}
