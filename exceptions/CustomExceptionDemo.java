public class CustomExceptionDemo {


	public static void moreRiskyStuff() throws MyCustomException {
		// something bad happened here, so ...
		throw new MyCustomException();
	}

	public static void lessRiskyStuff() {
		// something bad happened here, so ...
		throw new MyRuntimeException();
	}
	
	public static void main(String [] args) {

		if (args.length > 0) {
			lessRiskyStuff();
		}
		
		try {
			moreRiskyStuff();
			
		} catch (MyCustomException e) {
			System.out.println("oops, bad things happened");
			System.out.println("In particular: " + e);
			e.printStackTrace();			
		}


	}

}
