package com.pearson.deitel.cards;

public class Card {
	private final String face;	// face of card ("Ace", "Deuce", ...)
	private final String suit;	// suit of card ("Hearts", "Diamonds", ...)
	
	/** Two-argument constructor initializes card's face and suit
	 * @param face
	 * @param suit
	 */
	public Card(String face, String suit) {
		this.face = face;
		this.suit = suit;
	}
	
	/**
	 * Return String representation of card
	 */
	public String toString() {
		return face + " of " + suit;
	}
}
