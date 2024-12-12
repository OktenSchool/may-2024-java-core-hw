package hw4.task3.modles;

import java.util.*;

public class ZooClub {
    private final Map<Person, List<Pet>> club = new HashMap<>();

    private String _inputString() {
        return new Scanner(System.in).nextLine();
    }

    private int _inputInt() {
        return new Scanner(System.in).nextInt();
    }

    private Map.Entry<Person, List<Pet>> _entryByPersonId() {
        int personId = this._inputInt();
        return this.club.entrySet().stream().filter(item -> item.getKey().getId() == personId).findFirst().orElse(null);
    }

    private void addPerson() {
        System.out.println("-------------------------------------------------------");
        Integer id = this.club
                .keySet()
                .stream()
                .max(Comparator.comparingInt(Person::getId))
                .map(person -> person.getId() + 1)
                .orElse(1);
        System.out.print("Enter name: ");
        String name = this._inputString();
        System.out.println("-------------------------------------------------------");
        this.club.put(new Person(id, name), new ArrayList<>());
    }

    private boolean showAll() {
        if (this.club.isEmpty()) {
            return false;
        }
        System.out.println("-------------------------------------------------------");
        this.club.forEach((person, pets) -> {
            System.out.println(person.getId() + ") " + person + " Pets: " + pets);
        });
        System.out.println("-------------------------------------------------------");
        return true;
    }

    private void addPet() {
        if (this.showAll()) {
            System.out.print("Add pet to: ");
            Map.Entry<Person, List<Pet>> personListEntry = this._entryByPersonId();

            if (personListEntry != null) {
                Animal[] values = Animal.values();

                for (int i = 0; i < values.length; i++) {
                    System.out.println(i + ") " + values[i]);
                }

                System.out.print("Make your choice: ");
                int index = this._inputInt();

                System.out.print("Enter name of pet: ");
                String name = this._inputString();

                Integer id = personListEntry.getValue()
                        .stream()
                        .max(Comparator.comparingInt(Pet::getId))
                        .map(pet -> pet.getId() + 1)
                        .orElse(1);
                personListEntry.getValue().add(new Pet(id, name, values[index]));
            } else {
                System.out.println("----------------------------------------------------");
                System.out.println("Person with this id does not exist");
                System.out.println("----------------------------------------------------");
            }
        } else {
            System.out.println("----------------------------------------------------");
            System.out.println("Club is empty");
            System.out.println("----------------------------------------------------");
        }
    }

    private void deletePet() {
        if (this.showAll()) {
            System.out.print("From whose: ");
            Map.Entry<Person, List<Pet>> personListEntry = this._entryByPersonId();

            if (personListEntry == null) {
                System.out.println("person not found");
                return;
            }

            personListEntry.getValue().forEach(pet -> {
                System.out.println(pet.getId() + ") " + pet);
            });

            System.out.print("choice id of pet: ");
            int id = this._inputInt();
            personListEntry.getValue().removeIf(pet -> pet.getId() == id);
        }
    }

    private void deletePerson() {
        if (!this.showAll()) {
            return;
        }

        System.out.print("Person id to delete: ");
        Map.Entry<Person, List<Pet>> person = this._entryByPersonId();

        if (person == null) {
            return;
        }
        this.club.remove(person.getKey());


    }

    private void deleteAnimalsByType() {
        Animal[] animals = Animal.values();

        for (int i = 0; i < animals.length; i++) {
            System.out.println(i + ") " + animals[i]);
        }
        System.out.println("Make your choice for delete");
        int index = this._inputInt();
        this.club.values().forEach(pets -> pets.removeIf(pet -> pet.getAnimal() == animals[index]));
    }

    public void menu() {
        while (true) {
            System.out.println("1) Add person to club");
            System.out.println("2) Add pet to person");
            System.out.println("3) Delete pet from person");
            System.out.println("4) Delete person from club");
            System.out.println("5) Delete pets by type");
            System.out.println("6) Show ZooClub");
            System.out.println("9) Exit");

            System.out.print("Make your choice: ");
            String choice = this._inputString();

            switch (choice) {
                case "1":
                    this.addPerson();
                    break;
                case "2":
                    this.addPet();
                    break;
                case "3":
                    this.deletePet();
                    break;
                case "4":
                    this.deletePerson();
                    break;
                case "5":
                    this.deleteAnimalsByType();
                    break;
                case "6":
                    this.showAll();
                    break;
                case "9":
                    return;
            }
        }
    }


}
