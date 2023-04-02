import java.util.Objects;

public class Person {

   private String name;
    private String surname;
    private int age;
    private String sex;
    private String city;

    public Person(String personName, String personSurname, int personAge, String personSex, String personCity) {
        name = personName;
        surname = personSurname;
        age = personAge;
        sex = personSex;
        city = personCity;
    }
     public String getName() {
         return name;
     }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            return false;
        }

        Person anotherPerson = (Person) obj;
        return Objects.equals(name, anotherPerson.name) && age == anotherPerson.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return String.format("%s %s [%d] %s %s", name, surname, age, sex, city);
    }
}
