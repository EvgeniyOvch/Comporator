import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        PersonComporator personComporator = new PersonComporator();
        person.add(new Person("Петров", "Максим", 15));
        person.add(new Person("Моксимов-Петров", "Илья", 20));
        person.add(new Person("Романов", "Дмитрий", 44));
        person.add(new Person("Иванова", "Мария", 16));
        person.add(new Person("Герасимов дер Герас", "Александр", 19));
        person.add(new Person("Анисимов", "Матвей", 44));
        person.add(new Person("Петрова", "Анастасия", 19));
        Collections.sort(person, personComporator);

        System.out.println(person);
    }
}