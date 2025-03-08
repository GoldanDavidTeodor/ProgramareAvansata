public class App {
    public static void main(String[] args) throws Exception {
        Greedy greedy = new Greedy(3, 3, 3);

        Student s1 = new Student("David", "17/07/2004", 1097);
        Student s2 = new Student("Cristian", "23/12/2004", 1003);
        Student s3 = new Student("Vali", "02/02/2004", 1253);
        greedy.newStudent(s1);
        greedy.newStudent(s2);
        greedy.newStudent(s3);

        Teacher t1 = new Teacher("Popa", "14/02/1980");
        Teacher t2 = new Teacher("Culac", "24/11/1979");
        greedy.newTeacher(t1);
        greedy.newTeacher(t2);

        Project p1 = new Project("Aplicatie Calculator", t1);
        Project p2 = new Project("Aplicatie Web", t1);
        Project p3 = new Project("SportBNB", t2);
        greedy.newProject(p1);
        greedy.newProject(p2);
        greedy.newProject(p3);

        greedy.allocate();
    }
}
