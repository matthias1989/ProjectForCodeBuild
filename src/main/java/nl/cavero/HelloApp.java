package nl.cavero;

public class HelloApp {

	public static void main(String[] args) {
		Integer result = sum(2,10);
		System.out.println("Hello world - 44: "+result);

	}
	
	public static Integer sum(Integer i1, Integer i2) {
		return i1 + i2;
	}

}
