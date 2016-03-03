package main;

public class Hello {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World !!"); 
		System.out.println("---------------"); 
		anotherHello(); // Calling another method in the same class
		
		/* A third print hello to practice the following:
		 * 1-Create a new class.
		 * 2-Create an object from a class
		 * 3-Implement the new object methods in another class 
		*/
		ThirdHello hello3 = new ThirdHello();
		System.out.println("---------------"); 
		hello3.thirdPrintHello();
	}

	/**
	 * This another Method to print another hello world as a practice to call another method
	 *  from the same class
	 */
	public static void anotherHello() {
		System.out.println("This is another Hello World !!");
	}

}
