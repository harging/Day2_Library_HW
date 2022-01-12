import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<>();
    }

    public int getBorrowedBooksAmount() {
        return borrowedBooks.size();
    }

    public void borrowBook(Library library, Book book) {
        library.removeBook(book);
        borrowedBooks.add(book);
    }
}
