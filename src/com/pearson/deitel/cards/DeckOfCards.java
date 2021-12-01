package com.pearson.deitel.cards;

import java.security.SecureRandom;

public class DeckOfCards {
	private static final int NUMBER_UF_CARDS = 52;							// total # of cards
	private static final SecureRandom randomNumbers = new SecureRandom();	// Random number generator
	
	private Card[] deck;		// array of card objects
	private int currentCard;	// index of next card to be dealt (0-51)
	
	/**
	 * No-argument constructor to fill the deck of cards
	 */
	public DeckOfCards() {
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", 
				"Nine", "Ten", "Jack", "Queen", "King" };
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		
		deck = new Card[NUMBER_UF_CARDS];	// create the array of card objects
		currentCard = 0;					// first card to be dealt is deck[0]
		
		// populate deck with card objects
		for (int count = 0; count < deck.length; count++)
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
	}
	
	/**
	 * Shuffle deck of cards with one-pass algorithm
	 */
	public void shuffle() {
		currentCard = 0;		// next call to method dealCard should start at deck[0] again
		
		// for each card, pick another random card (0-51) and swap them
		for (int first = 0; first < deck.length; first++) {
			// select a random number between 0 and 51
			int second = randomNumbers.nextInt(NUMBER_UF_CARDS);
			
			// swap current card with randomly selected card
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	/**
	 * Deal one card
	 * @return
	 */
	public Card dealCard() {
		if (currentCard < deck.length)		// determine whether cards remain to be dealt
			return deck[currentCard++];		// return current card in array
		else
			return null;					// return null to indicate that all cards were dealt
	}
}
