package com.pearson.deitel.cards;

public class DeckOfCardsTest {

	public static void main(String[] args) {
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfCards.shuffle();				// place cards in random order
		
		for (int i = 1; i <= 52; i++) {		// print all 52 cards in the order in which they are dealt
			System.out.printf("%-19s", deckOfCards.dealCard());		// deal and display a card
			if (i % 4 == 0)
				System.out.println();		// output a newline after every fourth card
		}
	}

}
