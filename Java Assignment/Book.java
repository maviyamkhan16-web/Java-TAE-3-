import java.util.*;

class Book {
    String title, author, isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }

    void display() {
        System.out.println(title + " " + author + " " + isbn);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        for(Book b : books) {
            if(b.isbn.equals(isbn)) {
                books.remove(b);
                break;
            }
        }
    }

    void displayBooks() {
        for(Book b : books)
            b.display();
    }

    public static void main(String args[]) {
        Library l = new Library();
        l.addBook(new Book("Java","James","101"));
        l.addBook(new Book("C","Dennis","102"));

        l.displayBooks();
    }
}