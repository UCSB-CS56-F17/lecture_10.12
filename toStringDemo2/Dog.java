
public class Dog {

    private String name;

    public Dog(String name) { this.name = name;}

    public static void main(String [] args) {
		Dog d1 = new Dog("Fido");
		System.out.println("d1="+d1);
	}

	@Override
	public String toString() {
		return "Dog(" + this.name + ")";
	}
	
}
