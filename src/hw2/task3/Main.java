package hw2.task3;

import hw2.task3.models.Book;
import hw2.task3.models.Comics;
import hw2.task3.models.Magazine;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(25, 200);
        Magazine magazine = new Magazine(25, 10, .5);
        Comics comics = new Comics(32, 25, "Max");

        System.out.println(book);
        System.out.println(magazine);
        System.out.println(comics);
    }
}
