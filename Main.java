import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Select an opinion: ");
            System.out.println("1. add");
            System.out.println("2. remove");
            System.out.println("3. view all books");
            System.out.println("4. exit");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                System.out.println("Enter book title");
                String title = scanner.next();

                Book book = new Book(title);
                library.bookAdd(book);

                case 2:
                    System.out.println("Enter book title: ");
                    String titleToRemove = scanner.next();
                    for (Book book1: library.books){
                        if (book1.getTitle().equals(titleToRemove));
                        break;
                    }
                case 3:
                    library.printAllBooks();
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option, please try again");
            }
        }
    }
}