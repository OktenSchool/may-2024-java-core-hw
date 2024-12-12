package hw4.task3.modles;

import java.util.Objects;

public class Pet {
    private int id;
    private String name;
    private Animal animal;

    public Pet() {
    }

    public Pet(int id, String name, Animal animal) {
        this.id = id;
        this.name = name;
        this.animal = animal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return getId() == pet.getId() && Objects.equals(getName(), pet.getName()) && getAnimal() == pet.getAnimal();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAnimal());
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", animal=" + animal +
                '}';
    }
}
