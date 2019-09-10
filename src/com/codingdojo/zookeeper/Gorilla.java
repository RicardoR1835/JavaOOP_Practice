package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Threw some poo at the tourists");
		int energyLevel = getEnergy();
		energyLevel -= 5;
		setEnergy(energyLevel);
	}
	public void eatBananas() {
		System.out.println("Ate some delicious naners");
		int energyLevel = getEnergy();
		energyLevel += 10;
		setEnergy(energyLevel);
	}
	public void climb() {
		System.out.println("Climbed up that tree!");
		int energyLevel = getEnergy();
		energyLevel -= 10;
		setEnergy(energyLevel);
	}
}
