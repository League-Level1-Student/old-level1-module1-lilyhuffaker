
public class SmurfRunner {
public static void main(String[] args) {
	Smurf Handy = new Smurf("Handy");
	System.out.println(Handy.getName());
	Handy.eat();
	System.out.println(Handy.getHatColor());
	Smurf Papa = new Smurf("Papa");
	Smurf Smurfette = new Smurf("Smurfette");
	System.out.println(Papa.getName());
	System.out.println(Smurfette.getName());
	System.out.println(Papa.getHatColor());
	System.out.println(Smurfette.getHatColor());
	System.out.println(Papa.isGirlOrBoy());
	System.out.println(Smurfette.isGirlOrBoy());
	Papa.eat();
	Smurfette.eat();
}
}
