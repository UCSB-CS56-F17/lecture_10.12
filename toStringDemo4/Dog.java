
public class Dog {

    private String name;

    public Dog(String name) { this.name = name;}

    public static void main(String [] args) {
		Dog d1 = new Dog("Fido");
		System.out.println("d1="+d1);
		System.out.println("d1 also is "+d1.to_string()); // this "works"
	}

	@Override
	public String to_string() { // will be an error
		return "Dog[" + this.name + "]";
	}
	
}
