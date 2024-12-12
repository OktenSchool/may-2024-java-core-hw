package hw3.task2;

import hw3.task2.models.Drum;
import hw3.task2.models.Guitar;
import hw3.task2.models.Instrument;
import hw3.task2.models.Trumpet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Instrument> instruments = Arrays.asList(
          new Drum(25),
          new Guitar(5),
          new Trumpet(25.5)
        );

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
