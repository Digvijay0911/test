// You have to impliment a library using java class Library.
// Methods: issueBook, returnBook, showAvailableBooks.
// Properties: Array to store available books.
//             Array to store the issued books.
// ____________________________________________________________

class myLibrary {
    String[] books;
    int no_of_books;

    myLibrary() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks() {
        System.out.println("Available books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);

        }
    }

    void issueBook(String book) {
        for (int i = 0; i <= this.books.length; i++) {

            if (this.books[i].equals(book)) {
                System.out.println(book + " book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("THis book does not exist");
    }

    void returnBook(String book) {
        addBook(book);
    }
}

public class bookStore {
    public static void main(String[] args) {

        myLibrary centralLibrary = new myLibrary();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("Data Structure");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}

// Comments for testing in branch probability
// add 2nd comment
