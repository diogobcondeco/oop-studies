public abstract class Soldier extends Person {
	private final boolean canFly;

	public boolean getCanFly() {
		return canFly;
	}

	Soldier(String name, Boolean canFly) {
		super(name);
		this.canFly = canFly;
	}

	abstract void attack();
}