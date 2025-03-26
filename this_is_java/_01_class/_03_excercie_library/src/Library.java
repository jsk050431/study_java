import java.util.ArrayList;

public class Library {
    
    // 필드
    private String name;
    private ArrayList<Book> books;

    // 생성자
    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    // 메소드
    void displayLibraryName() {
        System.out.println(name);
    }

    void addBook(Book book) {
        books.add(book);
    }

    void borrowBook (String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("해당 도서를 찾을 수 없습니다.");
    }

    void returnBook (String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("해당 도서를 찾을 수 없습니다.");
    }

    void displayAllBooks() {
        for (Book book : books) {
            book.displayInfo();
        }
    }

    void findBooksByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                book.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당 도서를 찾을 수 없습니다.");
        }
    }

    void findBooksAfterYear(int year) {
        for (Book book : books) {
            if (book.getYear() >= year) {
                book.displayInfo();
            }
        }
    }

    void findThickestBook() {
        int maxPages = 0;
        ArrayList<Book> books_maxPage = new ArrayList<>();
        int page;
        for (Book book : books) {
            page = book.getPageCount();
            if (page > maxPages) {
                maxPages = book.getPageCount();
                books_maxPage.clear();
                books_maxPage.add(book);
            } else if (page == maxPages) {
                books_maxPage.add(book);
            }
        }
        
        for (Book book : books_maxPage) {
            book.displayInfo();
        }
    }
}
