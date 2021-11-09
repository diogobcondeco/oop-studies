public class Warrior extends Soldier {
	Warrior(String name) {
		super(name, false);
	}

	@Override
	void attack() {
		System.out.println("The warrior " + super.getName() + " runs to the enemy and attacks by swinging his tiny dagger");
	}
}
