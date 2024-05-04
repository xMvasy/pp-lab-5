import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        
        Person[] people = new Person[5];
    
        final int b = 10;

        try {
            people[0] = new Person("Jan Kowalski", 30);
            people[1] = new Person("Joanna Nowak", 25);
            people[2] = new Person("Piotr Kowalczyk", 40);
            people[3] = new Person("Radziu Mazur", 22);
            people[4] = new Person("Michał Wojcik", 35);

            
            Messenger messenger = new EmailMessenger();

        
            for (Person person : people) {
                int agePlusB = MathUtils.add(person.getAge(), b);
                messenger.sendMessage(person.getName() + " wiek + 10: " + agePlusB);
            }
        } catch (InvalidAgeException e) {
            System.err.println("Podano nieprawidłowy wiek: " + e.getMessage());
        }
    }
}
