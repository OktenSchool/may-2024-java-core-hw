package hw4.task2;

import hw4.task2.enums.Gender;
import hw4.task2.models.Car;
import hw4.task2.models.Skill;
import hw4.task2.models.User;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        HashSet<User> users = new HashSet<>();
//        users.add(new User(1, "Popov", "admin@gmail.com", 15, Gender.MALE, new Car("BMW", 200, 200)));
//        users.add(new User(1, "Popov", "admin@gmail.com", 15, Gender.FEMALE, new Car("BMW", 200, 200)));
//        users.add(new User(1, "Popov", "admin@gmail.com", 15, Gender.MALE, new Car("BMW", 200, 200)));
//        users.add(new User(1, "Popov", "admin@gmail.com", 15, Gender.FEMALE, new Car("BMW", 200, 200)));
//
//        users.removeIf(user -> user.getGender() == Gender.MALE);
//
//        System.out.println(users);

        TreeSet<User> usersSorted = new TreeSet<>();
        User user1 = new User(1, "Popov", "admin@gmail.com", 15, Gender.MALE, new Car("BMW", 200, 200));
        user1.getSkills().add(new Skill("js", 10));
        user1.getSkills().add(new Skill("java", 10));
        user1.getSkills().add(new Skill("python", 10));

        User user2 = new User(1, "Popov", "admin@gmail.com", 15, Gender.MALE, new Car("BMW", 200, 200));
        user2.getSkills().add(new Skill("java", 10));
        user2.getSkills().add(new Skill("python", 10));

        User user3 = new User(1, "Popov", "admin@gmail.com", 15, Gender.MALE, new Car("BMW", 200, 200));
        user3.getSkills().add(new Skill("java", 10));
        user3.getSkills().add(new Skill("python", 10));
        user3.getSkills().add(new Skill("css", 10));
        user3.getSkills().add(new Skill("html", 10));

        User user4 = new User(1, "Popov", "admin@gmail.com", 15, Gender.MALE, new Car("BMW", 200, 200));
        user4.getSkills().add(new Skill("java", 10));
        usersSorted.add(user1);
        usersSorted.add(user2);
        usersSorted.add(user3);
        usersSorted.add(user4);
        usersSorted.forEach(System.out::println);
    }
}
