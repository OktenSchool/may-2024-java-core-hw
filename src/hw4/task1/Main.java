package hw4.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Max", 16),
                new User("Karina", 20),
                new User("Olha", 25),
                new User("Kokos", 5)

        );

//        users.sort((u1, u2) -> u1.getAge() - u2.getAge());
        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println(users);
        users.sort((u1, u2) -> u2.getAge() - u1.getAge());
        System.out.println(users);
        List<String> words = Arrays.asList(
                "Max", "Karina", "Olha", "Kokos", "Anna"
        );
//        words.sort((s, t1) -> s.compareTo(t1));
        words.sort(String::compareTo);
        System.out.println(words);
//        words.sort((u1, u2) -> u1.length() - u2.length());
        words.sort(Comparator.comparingInt(String::length));
        System.out.println(words);
    }

}
