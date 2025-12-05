package exam.codewriting.q2;

import java.util.LinkedList;

/*
 * We now wish to create a SolarSystem class. The beginnings of this class have been
provided to you below. Examine the instructions and complete the remaining methods.
 */
public class SolarSystem {
	// Instance variables (do not change)
	private String name ;
	private LinkedList < Planet > planets ;
	// Write the constructor for the SolarSystem class.
	// When a SolarSystem is first created, it should not contain any planets.
	public SolarSystem(String name) {
		this.name = name;
		this.planets = new LinkedList<>();
	}
	public String getName () {
		return this.name; //FIXME
	}
	public void addPlanet ( Planet p) {
		planets.add(p);
	}
	public int getNumberOfPlanets () {
		return planets.size(); //FIXME
	}
	/**
	* Returns the sum of the masses of all planets in the solar system
	*/
	public double getTotalMass () {
		int sum = 0;
		for (int i = 0; i < planets.size(); i++){
			sum += planets.get(i).getMass();
		}
		return sum; //FIXME
	}
	public static void main(String[] args) {
		//Write a line of code that creates an instance of the Planet 
		// class by calling the constructor. You should
		//also declare a variable to hold the newly created instance.
		Planet p1 = new Planet("Jupiter", 80);
		//Write a line of code that creates an instance of the SolarSystem 
		// class by calling the constructor. You
		//should also declare a variable to hold the newly created instance.
		SolarSystem s1 = new SolarSystem("Milky Way");
		//Write a line of code that will add the Planet to the SolarSystem
		s1.addPlanet(p1);
		//Write a line of code that will retrieve the total mass from 
		// the SolarSystem
		System.out.println(s1.getTotalMass());
	}
}
