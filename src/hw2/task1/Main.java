package hw2.task1;


import hw2.task1.models.Address;
import hw2.task1.models.Company;
import hw2.task1.models.Geo;
import hw2.task1.models.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                1,
                "Max",
                "max25",
                "admin@gmail.com",
                new Address(
                        "street",
                        "sdfsf",
                        "Lviv",
                        "79000",
                        new Geo(
                                "021555555",
                                "5665544444"
                        )
                ),
                "095545555",
                "max.com",
                new Company(
                        "my_company",
                        "dfdfdfdf",
                        "sdfsfd"
                )
        );

        System.out.println(user);
    }
}
