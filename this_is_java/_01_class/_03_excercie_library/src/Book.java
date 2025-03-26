public class Book {
    
    // 필드
    private String title;
    private String author;
    private int year;
    private int pageCount;
    private boolean isBorrowed;

    // 생성자
    Book() {
        this("Unknown", "Unknown", 2000, 100);
    }

    Book(String title, String author) {
        this(title, author, 2000, 100);
    }

    Book(String title, String author, int year, int pageCount) {
        this.title = title;
        this.author = author;
        this. year = year;
        this.pageCount = pageCount;
    }

    // 메소드
    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    int getYear() {
        return this.year;
    }

    int getPageCount() {
        return this.pageCount;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("대출할 수 없습니다. 이미 대출중인 도서입니다.");
        } else {
            isBorrowed = true;
            System.out.println("대출되었습니다.");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("반납되었습니다.");
        } else {
            System.out.println("반납할 수 없습니다. 대출중인 도서가 아닙니다.");
        }
    }

    void displayInfo() {
        System.out.println(String.format("<제목>%s <저자>%s <출판연도>%d <페이지>%d", title, author, year, pageCount));
    }
}
