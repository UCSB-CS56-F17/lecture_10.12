public class Dog {

	public String toString() {
		return this.name;
	}
	
    private static Dog dogOfTheWeek = null;
    private String name;

	public void finalize() {
		System.out.println("Dog : " + this.name + " is finalized");
	}
	
    public void setAsDogOfTheWeek() {
		dogOfTheWeek = this;
    }

    public static void resetDogOfTheWeek() {
		dogOfTheWeek = null;
    }

    public static Dog getDogOfTheWeek() {
		return dogOfTheWeek;
    }

    public Dog(String name) { this.name = name;}

    public static void main(String [] args) {

	Dog d1 = new Dog("Fido");
	Dog d2 = new Dog("Princess");
	Dog d3 = new Dog("Rover");
	Dog d4 = new Dog("Snoopy");
	Dog d5 = new Dog("Spot");
	Dog d6 = d2;
	
	d4.setAsDogOfTheWeek();  gc(29);    
	d5 = d2;                 gc(30);                   
	Dog temp = d3;           gc(31);             
	d3 = d5;                 gc(32);                   
	d5 = temp;               gc(33);                 
	d3 = getDogOfTheWeek();  gc(34);    
	d1.setAsDogOfTheWeek();  gc(35);    
	/*	d6 = null;               gc(36);
	d5 = null;               gc(37);			
	d4 = null;               gc(38);                 
	d3 = null;               gc(39);                 
	d2 = null;               gc(40);                 
	d1 = null;               gc(41);                 
	temp = null;             gc(42); */
	// resetDogOfTheWeek();     gc(43);
    }                              

    public static void gc(int i) {
		System.out.println("gc: i=" + i);
		System.gc();
		System.runFinalization ();
		System.gc();
		System.runFinalization ();
		// ... encourage garbage collection
    }     

}
