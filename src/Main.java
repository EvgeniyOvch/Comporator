import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        //PersonComporator personComporator = new PersonComporator();
        person.add(new Person("Петров", "Максим", 15));
        person.add(new Person("Моксимов-Петров", "Илья", 20));
        person.add(new Person("Романов", "Дмитрий", 44));
        person.add(new Person("Иванова", "Мария", 16));
        person.add(new Person("Герасимов дер Герас", "Александр", 19));
        person.add(new Person("Анисимов", "Матвей", 44));
        person.add(new Person("Петрова", "Анастасия", 19));

        Comparator<Person> comparator = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                int lengt1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
                int lengt2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;
                if (lengt1 != lengt2) {
                    return Integer.compare(lengt2, lengt1);
                }
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        Collections.sort(person, comparator);
        System.out.println(person);
    }
}