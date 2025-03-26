public class Main {
    public static void main(String[] args) {
        // 도서관 객체 생성
        Library myLibrary = new Library("서울시립도서관");

        // 책 객체 생성
        Book book1 = new Book("자바 프로그래밍", "홍길동", 2020, 500);
        Book book2 = new Book("알고리즘 기초", "김영희", 2021, 350);
        Book book3 = new Book("파이썬의 모든 것", "이철수", 2022, 600);
        Book book4 = new Book("자료구조", "박지민", 2022, 600);

        // 도서관에 책 추가
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        myLibrary.addBook(book4);

        // 도서관 이름 출력
        myLibrary.displayLibraryName();
        
        // 모든 책 정보 출력
        System.out.println("\n모든 도서 정보:");
        myLibrary.displayAllBooks();

        // 책 대출
        System.out.println("\n'자바 프로그래밍' 대출 시도:");
        myLibrary.borrowBook("자바 프로그래밍");

        // 이미 대출된 책을 다시 대출 시도
        System.out.println("\n'자바 프로그래밍' 재대출 시도:");
        myLibrary.borrowBook("자바 프로그래밍");

        // 책 반납
        System.out.println("\n'자바 프로그래밍' 반납 시도:");
        myLibrary.returnBook("자바 프로그래밍");

        // 대출되지 않은 책을 반납 시도
        System.out.println("\n'자바 프로그래밍' 재반납 시도:");
        myLibrary.returnBook("자바 프로그래밍");

        // 특정 저자의 책 찾기
        System.out.println("\n'김영희' 저자의 책:");
        myLibrary.findBooksByAuthor("김영희");

        // 2022년 이후 출판된 책 찾기
        System.out.println("\n2022년 이후 출판된 책:");
        myLibrary.findBooksAfterYear(2022);

        // 가장 두꺼운 책 찾기
        System.out.println("\n가장 두꺼운 책:");
        myLibrary.findThickestBook();
    }
}
