package assignment2;

public class Zoo {
    public int calculatePrice(Person person) {
        if(person.age>= 0 && person.age <= 5) {
            return 0;
        } else if (person.age >5 && person.age <=12) {
            return 5;
        } else {
            return 15;
        }
    }
}
