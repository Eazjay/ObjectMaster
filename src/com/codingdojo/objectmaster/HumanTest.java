package com.codingdojo.objectmaster;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		
		h.displayHealth();
		h.attack(h);
		h.displayHealth();
	}
}
