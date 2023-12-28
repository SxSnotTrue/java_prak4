public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", 1949);
        System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor() + ", published in " + book.getYear());

        book.setTitle("Animal Farm");
        book.setAuthor("George Orwell");
        book.setYear(1945);
        System.out.println("Updated Book: " + book.getTitle() + " by " + book.getAuthor() + ", published in " + book.getYear());
    }
}