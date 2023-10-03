import dev.lpa.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person1 = new Person(10,"mat",null);
        Person person2 = new Person(21,"sam",null);

        Person[] children = {person1,person2};

        Person person3 = new Person(80,"jobs",children);

        System.out.println(Arrays.toString(person3.children()));

        children[0] = new Person(30,"bukker",null);

        System.out.println(Arrays.toString(person3.children()));

        Comparator<Person> comparator = Comparator.comparing(Person::name).reversed();

        Arrays.sort(person3.children(), comparator);

        System.out.println(Arrays.toString(person3.children()));

        List<Person> personList = Arrays.asList(person3.children());

        //with comparator
        personList.sort(comparator);
        //this will use the compare to function
        personList.sort(null);

        System.out.println(personList);


    }
}