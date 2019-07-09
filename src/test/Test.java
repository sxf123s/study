package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1111111");
		
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
		
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
		
		Singleton2 s1 = Singleton2.getSingleton();
		Singleton2 s2 = Singleton2.getSingleton();
		
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

}
