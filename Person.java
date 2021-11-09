public class Person {
	private final String name;

	public String getName() {
		return name;
	}

	Person(String name) {
		if (name == null) {
			throw new NullPointerException("Name can not be null");
		} 
		this.name = name;
	}

	public void eat() {
		System.out.println(name + " is eating");
	}

	public void relax() {
		System.out.println(name + " is relaxing");
	}
}
