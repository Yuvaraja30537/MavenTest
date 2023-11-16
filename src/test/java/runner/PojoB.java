package runner;

public class PojoB {

	public static void main(String[] args) {
		
		PojoA d = new PojoA();
		
		String name = d.getname();
		System.out.println("Before setters: "+name);
		d.setname("nothing");
		String b = d.getname();
		System.out.println("After setters: "+b);
	}
}
