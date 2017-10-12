public class Instance2 {

	private int x; // does this get initialized to a default value

	public int getX() { return this.x; }
	public void setX(int x) { this.x = x; }

	public Instance2() {
		// left blank on purpose to see what happens to x
	}
	
	public static void main( String [] args) {

		Instance2 thing = new Instance2();
		System.out.println(thing.getX());
		
	}

}
