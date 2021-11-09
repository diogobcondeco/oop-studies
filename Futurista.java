public class Futurista extends Soldier {
	Futurista(String n) {
		super(n, true);
	}

	@Override
	void attack() {
		System.out.println("The futurista " + super.getName() + " uses his power to fly super high in the sky and uses his lazer to attack");
	}
}
