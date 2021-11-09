public class Person {
	private String name;

	public String getName() {
		return name;
	}

	private void setName(String n) {
		this.name = n;
	}

	Person(String n) {
		this.setName(n);
	}

	public void eat() {
		System.out.println(name + " is eating some 😺");
	}

	public void scratchTheNuts() {
		System.out.println(name + " is scratching dis 🥜");
	}
}
