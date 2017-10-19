
public class Dog {

    private String name;

    public Dog(String name) { this.name = name;}

    public static void main(String [] args) {

		String s1="Fido";
		String s2=new String("Fido");

		System.out.println("s1==s2: " + (s1==s2));
		System.out.println("s1.equals(s2): " + (s1.equals(s2)));

		Dog d1 = new Dog("Fido");
		Dog d2 = new Dog("Fido");
		Dog d3 = d2;

		System.out.println("d1==d2: " + (d1==d2));
		System.out.println("d1.equals(d2): " + (d1.equals(d2)));		

		System.out.println("d3==d2: " + (d3==d2));
		System.out.println("d3.equals(d2): " + (d3.equals(d2)));		

	}

	@Override
	public String toString() { 
		return "Dog[" + this.name + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (o==null) return false;
		if (! (o instanceof Dog) ) return false;
		Dog d = (Dog) o;
		return d.name.equals(this.name);
	}
}
