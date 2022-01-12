import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;
    Book book7;
    Book book8;

    @Before
    public void setUp() {
        library = new Library();
        book1 = new Book("The Shining", "S King", "Horror");
        book2 = new Book("The Stand", "S King", "Horror");
        book3 = new Book("I have a dream", "M L King", "Non-fiction");
        book4 = new Book("The Broken Bubble", "P K Dick", "Sci-fi");
        book5 = new Book("Fly Fishing", "J R Hartley", "Non-fiction");
        book6 = new Book("The Fountains of Paradise", "A C Clarke", "Sci-fi");
        book7 = new Book("The Hobbit", "J R R Tolkien", "Fantasy");
        book8 = new Book("Call of the Wild", "J London", "Fiction");
    }

    @Test
    public void stockStartsZero() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book3);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canIncreaseCapacity() {
        library.addBook(book1);
        assertEquals(1, library.getCapacity());
    }

    @Test
    public void canDecreaseCapacity() {
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(0, library.getCapacity());
    }
}
