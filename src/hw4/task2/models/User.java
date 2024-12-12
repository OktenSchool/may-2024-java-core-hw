package hw4.task2.models;

import hw4.task2.enums.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User implements Comparable<User> {
    private int id;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private final List<Skill> skills = new ArrayList<>();
    private Car car;

    public User() {
    }

    public User(int id, String surname, String email, int age, Gender gender, Car car) {
        this.id = id;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getId() == user.getId() && getAge() == user.getAge() && Objects.equals(getSurname(), user.getSurname()) && Objects.equals(getEmail(), user.getEmail()) && getGender() == user.getGender() && Objects.equals(getSkills(), user.getSkills()) && Objects.equals(getCar(), user.getCar());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSurname(), getEmail(), getAge(), getGender(), getSkills(), getCar());
    }

    @Override
    public int compareTo(User user) {
        return this.skills.size() - user.getSkills().size();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", skills=" + skills +
                ", car=" + car +
                '}';
    }
}
