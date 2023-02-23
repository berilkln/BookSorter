import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> book =new ArrayList<Book>();
        book.add(new Book("Animal Farm",162,"George Orwell","08-17-1945"));
        book.add(new Book("Circe",408,"Medaline Miller","02-14-2019"));
        book.add(new Book("A Tale Of Two Cities",450,"Charles Dickens","11-17-1859"));
        book.add(new Book("The Midnight Library",283,"George Orwell","08-13-2020"));
        book.add(new Book("The Catcher in The Rye",234,"Jerome David Salinger","07-16-1951"));


        System.out.println("------WELCOME TO THE LIBRARY------");
        System.out.println("""
                Please Choose the action you want to do:
                1: Sort books by name
                2: Sort books by page count
                3: Exit""");

        while (true){
            Scanner sc = new Scanner(System.in);

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Sorting by the book name:");
                    book.sort(new NameComparator());
                    for (Book stt : book) {
                        System.out.println("\nBook Name: " + stt.getBookName() + "----Number of Page:" + stt.getPageCount() + "----Publication Date: " + stt.getPublishDate());
                    }
                }
                case 2 -> {
                    System.out.println("Sorting by the page count:");
                    book.sort(new PageCountComparator());
                    for (Book st : book) {
                        System.out.println("\nBook Name: " + st.getBookName() + "----Number of Page:" + st.getPageCount() + "----Publication Date: " + st.getPublishDate());
                    }
                }
                case 3 -> System.exit(1);
                default -> System.out.println("Please make a valid choice!");
            }

            System.out.print("Choose the action you want to do: ");

        }




    }




}