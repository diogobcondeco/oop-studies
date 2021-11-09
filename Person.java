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
		System.out.println(name + " is eating some 😺");
	}

	public void scratchTheNuts() {
		System.out.println(name + " is scratching dis 🥜");
	}
}
