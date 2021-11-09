public class Soldado extends Soldier {
	Soldado(String n) {
		super(n, true);
	}

	@Override
	void attack() {
		System.out.println("The soldado " + super.getName() + " gets his Desert Eagle, loads with his .50 bullets, aims at the enemy and shoots it perfectly");
	}
}
