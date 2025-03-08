public class Student extends Person {
    private int registrationNumber;

    public Student(String name, String dateOfBirth, int registrationNumber) {
        super(name, dateOfBirth);
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) return false;
        Student student = (Student) obj;
        return registrationNumber == student.registrationNumber;
    }
    
}
