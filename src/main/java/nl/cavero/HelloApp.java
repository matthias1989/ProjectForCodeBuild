package nl.cavero;

public class HelloApp {

	public static void main(String[] args) {
		Integer result = sum(2,3);
		System.out.println("Hello world - 7 : "+result);

	}
	
	public static Integer sum(Integer i1, Integer i2) {
		return i1 + i2;
	}

}
