package hw3.task1;

import hw3.task1.models.Book;
import hw3.task1.models.Magazine;
import hw3.task1.models.Printable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Printable> printables = Arrays.asList(
                new Book("book1"),
                new Magazine("magazine3"),
                new Book("book2"),
                new Book("book3"),
                new Magazine("magazine1"),
                new Magazine("magazine2")
        );
        for (Printable printable : printables) {
            printable.print();
        }
    }
}
