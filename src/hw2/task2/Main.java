package hw2.task2;

import hw2.task2.models.Laptop;
import hw2.task2.models.Ultrabook;
import hw2.task2.models.WorkStation;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(8, 8, 15.5, 2);
        Ultrabook ultrabook = new Ultrabook(6, 25, 20.5, 25, 1);
        WorkStation workStation = new WorkStation(25, 32, 32, 55, "NVidia");

        System.out.println(laptop);
        System.out.println(ultrabook);
        System.out.println(workStation);
    }
}
