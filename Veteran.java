public class Veteran extends Soldier {
	Veteran(String name) {
		super(name, true);
	}

	@Override
	void attack() {
		System.out.println("The veteran " + super.getName() + " gets his Desert Eagle, loads with his .50 bullets, aims at the enemy and shoots it perfectly");
	}
}
