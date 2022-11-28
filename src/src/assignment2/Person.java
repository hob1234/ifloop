package assignment2;

public class Person {
    String name;
    int age;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public static void main(String[] args) {
        Person person1 = new Person(3, "baby");
        Person person2 = new Person(10, "baby");
        Person person3 = new Person(63, "baby");

        Zoo zoo = new Zoo();
        System.out.println(zoo.calculatePrice(person1));
        System.out.println(zoo.calculatePrice(person2));
        System.out.println(zoo.calculatePrice(person3));

    }
}
