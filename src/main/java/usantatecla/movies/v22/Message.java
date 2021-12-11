package usantatecla.movies.v22;

public enum Message {
    RENTAL_RECORD ("Rental record for "),
    LINE_BREAK ("\n"),
    TABULATE ("\t"),
    AMOUNT ("Amount owed is "),
    EARNED ("You earned "),
    FREQUENT_RENTER (" frequent renter points");

    Message(String message) {
    }
}
