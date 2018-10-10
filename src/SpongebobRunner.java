
public class SpongebobRunner {
	public static void main(String[] args) {
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		Spongebob.eat();
		Spongebob.laugh();
		SeaCreature Squidward = new SeaCreature("Squidward");
		SeaCreature Patrick = new SeaCreature("Patrick");
		Squidward.getName();
		Patrick.getName();
		Patrick.eat();
		Squidward.eat();
		Squidward.laugh();
		Patrick.laugh();
		
	}
}
