public class TryIt {
	
       public static void main(String [] args) {
		   
		   Dog.main(args);
		   Dog.gc(0);
		   System.out.println("Dog of the week is" + Dog.getDogOfTheWeek());
       }

}
