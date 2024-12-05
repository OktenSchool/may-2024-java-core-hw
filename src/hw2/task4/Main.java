package hw2.task4;

import hw2.task4.enums.Gender;
import hw2.task4.models.Car;
import hw2.task4.models.Skill;
import hw2.task4.models.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                1,
                "Popov",
                "popov@gmail.com",
                25,
                Gender.MALE,
                new Car("BMW", 2000, 200)
        );

        user.getSkills().add(new Skill("js", 5));
        user.getSkills().add(new Skill("java", 1));
        user.getSkills().add(new Skill("python ", 10));

        System.out.println(user);
    }
}
