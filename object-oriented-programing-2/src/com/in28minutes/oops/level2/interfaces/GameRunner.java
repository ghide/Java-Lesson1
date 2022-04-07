package com.in28minutes.oops.level2.interfaces;

public class GameRunner {

	public static void main(String[] args) {

		// MarioGame game = new MarioGame();

		// GamingConsole game = new CheeseGame();

		CheeseGame game = new CheeseGame();

		game.up();
		game.down();
		game.left();
		game.right();

	}

}
