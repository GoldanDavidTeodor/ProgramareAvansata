public class Person {
    public String name;
    private String dateOfBirth;

    public Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) return false;
        Person person = (Person) obj;
        return name.equals(person.name) && dateOfBirth.equals(person.dateOfBirth);
    }

}
