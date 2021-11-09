public class Jedi extends Soldier {
	Jedi(String name) {
		super(name, true);
	}

	@Override
	void attack() {
		System.out.println("The jedi " + super.getName() + " uses his power to fly super high in the sky and uses his laser to attack");
	}
}
