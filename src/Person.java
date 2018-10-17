
public class Person {
	public String name;
	public String superpower;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuperpower() {
		return superpower;
	}
	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}
	public Person(String name, String superpower) {
		this.name = name;
		this.superpower = superpower;
	}
	public String toString() {
		return (getName() + "'s super power is " + getSuperpower());
	}
}
