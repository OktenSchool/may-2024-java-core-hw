package hw1;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("book1", 200, new String[]{"author1", "author2"}, "comedy"),
                new Book("book2", 300, new String[]{"author1", "author2"}, "comedy"),
                new Book("book3", 200, new String[]{"author1"}, "comedy"),
        };

        for (Book book : books) {
            System.out.println(book);
        }

        Car[] cars = new Car[]{
                new Car("BMW", 200, 1.7,true),
                new Car("AUDI", 180, 1.4,false),
                new Car("KIA", 220, 2.0,true),
        };

        for (Car car : cars) {
            System.out.println(car);
        }

        Comments[] comments = new Comments[]{
                new Comments(1, 1, "comment1", "comment@gmail.com", "some text"),
                new Comments(2, 2, "comment2", "comment@gmail.com", "some text"),
                new Comments(1, 3, "comment3", "comment@gmail.com", "some text"),
        };

        for (Comments comment : comments) {
            System.out.println(comment);
        }

        Dog[] dogs = new Dog[]{
                new Dog("Max", 5,"golden retriever"),
                new Dog("Barsik", 10,"golden retriever"),
                new Dog("Muhtar", 7,"golden retriever"),

        };

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        Post[] posts = new Post[]{
                new Post(1, 2, "post1", "some text"),
                new Post(2, 2, "post2", "some text"),
                new Post(3, 2, "post3", "some text"),
        };
        for (Post post : posts) {
            System.out.println(post);
        }
    }
}
