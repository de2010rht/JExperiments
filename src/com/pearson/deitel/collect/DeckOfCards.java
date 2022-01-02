package com.pearson.deitel.collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Card {
	public static enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, 
		Nine, Ten, Jack, Queen, King};
	public static enum Suit {Hearts, Diamonds, Clubs, Spades};
	
	private final Face face;
	private final Suit suit;
	
	/**
	 * @param face
	 * @param suit
	 */
	public Card(Face face, Suit suit) {
		this.face = face;
		this.suit = suit;
	}

	/**
	 * @return the face
	 */
	public Face getFace() {
		return face;
	}

	/**
	 * @return the suit
	 */
	public Suit getSuit() {
		return suit;
	}
	
	@Override
	public String toString() {
		return String.format("%s of %s", face, suit);
	}
}

public class DeckOfCards {
	private static final int NUMBER_OF_CARDS = 52;
	
	private List<Card> listOfCards;

	public DeckOfCards() {
		Card[] deck = new Card[NUMBER_OF_CARDS];
		int count = 0;
		
		for (Card.Suit suit : Card.Suit.values())
			for (Card.Face face : Card.Face.values())
				deck[count++] = new Card(face, suit);
		
		listOfCards = Arrays.asList(deck);
		Collections.shuffle(listOfCards);
	}
	
	public void printCards() {
		for (int i = 0; i < listOfCards.size(); i++)
			System.out.printf("%-19s%s", listOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : "");
	}

	public static void main(String[] args) {
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfCards.printCards();
	}

}
