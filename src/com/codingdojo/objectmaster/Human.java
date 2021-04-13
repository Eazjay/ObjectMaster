package com.codingdojo.objectmaster;

public class Human {
	int health = 100;
	int strength = 3;
	int stealth = 3;
	int intelligence = 3;
	
	public void displayHealth() {
		int humanHealth = health;
		System.out.println("Health is : " + humanHealth);
	}
	
	public void attack(Human human) {
		System.out.println("Attacked a human.");
		human.health -= this.strength;
	}
}
