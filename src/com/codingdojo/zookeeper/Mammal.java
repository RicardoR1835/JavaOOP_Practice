package com.codingdojo.zookeeper;

public class Mammal {
	private int energy;
	public Mammal() {
		energy = 100;
	}
	public int displayEnergy() {
		System.out.println("Energy level is: " + this.energy);
		return this.energy;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
}
