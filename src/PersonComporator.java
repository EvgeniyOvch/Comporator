import java.util.Comparator;

public class PersonComporator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int lengt1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
        int lengt2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;
        if (lengt1 != lengt2) {
            return Integer.compare(lengt2, lengt1);
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

