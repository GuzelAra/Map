
import java.io.IOException;
import java.security.Key;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person person1 = new Person("Anna","Ivanova",34, "female", "Moscow");
        Person person2 = new Person("Anna","Ivanova",34, "female", "Moscow");


        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

    }

}

