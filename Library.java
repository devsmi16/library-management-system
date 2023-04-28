import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    private int bookCount;

    public Library(){
        books = new ArrayList<>();
        bookCount = 0;
    }
    public void bookAdd(Book book){
        books.add(book);
        bookCount++;
        System.out.println("Book added to the library");
    }
    public void bookRemove(Book book){
        if (!books.remove(book)){
            bookCount--;
            System.out.println("Book removed from the library");
        }else {
            System.out.println("Book not found in the library");
        }
    }
    public void printAllBooks(){
        if(bookCount == 0){
            System.out.println("No books in the library");
        }else {
            for (Book book : books){
                System.out.println(book.toString());
            }
        }
    }
}
