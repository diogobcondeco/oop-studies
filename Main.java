public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("Peasant");
		Warrior g1 = new Warrior("Tiago");
		Veteran s1 = new Veteran("Daniel");
		Jedi f1 = new Jedi("Diogo");

		System.out.println("----- GET NAME -----");
		System.out.println(g1.getName());
		System.out.println(s1.getName());
		System.out.println(f1.getName());

		System.out.println("----- GET CAN FLY -----");
		System.out.println(g1.getCanFly());
		System.out.println(s1.getCanFly());
		System.out.println(f1.getCanFly());

		System.out.println("----- EAT ----------");
		g1.eat();
		s1.eat();
		f1.eat();

		System.out.println("----- SCRATCH DIS NUTS -----");
		g1.scratchTheNuts();
		s1.scratchTheNuts();
		f1.scratchTheNuts();

		System.out.println("----- ATTACK -----");
		g1.attack();
		s1.attack();
		f1.attack();

		System.out.println("----- PEASANT STUFF -----");
		p1.eat();
		p1.scratchTheNuts();
		System.out.println(p1.getName());
	}
}
