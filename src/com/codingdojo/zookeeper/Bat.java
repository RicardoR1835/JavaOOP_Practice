package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		energy = 300;
	}
	public void fly() {
		System.out.println("Cacawwww");
		energy -= 50;
	}
	public void eatHumans() {
		System.out.println("AHHHHHHH *human being eaten");
		energy += 25;
	}
	public void attackTown() {
		System.out.println("*noises of town on fire*");
		energy -= 100;
	}
	public void getBatEnergy() {
		System.out.println("Calculating energy....");
		System.out.println(super.getEnergy());
	}
}
