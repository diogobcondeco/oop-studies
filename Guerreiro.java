public class Guerreiro extends Soldier {
	Guerreiro(String n) {
		super(n, false);
	}

	@Override
	void attack() {
		System.out.println("The guerreiro " + super.getName() + " runs to the enemy and attacks by swinging his tiny sword");
	}
}
