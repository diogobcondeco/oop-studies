public abstract class Soldier extends Person {
	private boolean canFly = true;

	public boolean getCanFly() {
		return canFly;
	}

	private void setCanFly(Boolean b) {
		this.canFly = b;
	}

	Soldier(String n, Boolean b) {
		super(n);
		this.setCanFly(b);
	}

	abstract void attack();
}