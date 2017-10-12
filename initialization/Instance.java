public class Instance {

	private int x; // does this get initialized to a default value

	public int getX() { return this.x; }
	public void setX(int x) { this.x = x; }
   
	
	public static void main( String [] args) {

		Instance thing = new Instance();
		System.out.println(thing.getX());
		
	}

}
