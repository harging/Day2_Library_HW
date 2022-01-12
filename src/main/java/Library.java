import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity = 0;

    public Library() {
        this.stock = new ArrayList<>();
    }

    public int bookCount() {
        return stock.size();
    }

    public void addBook(Book book) {
        if (capacity <= 12) {
        stock.add(book);
        capacity += 1;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public Book removeBook(Book book) {
        stock.remove(book);
        capacity -= 1;
        return book;
    }
}
