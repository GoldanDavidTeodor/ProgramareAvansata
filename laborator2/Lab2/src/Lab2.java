public class Lab2 {
    public static void main(String[] args) throws Exception {
        Project P1 = new Project("P1", Type.Theoretical);
        Project P2 = new Project("P2", Type.Theoretical);
        Project P3 = new Project("P3", Type.Practical);
        Project P4 = new Project("P4", Type.Theoretical);

        Project[] l1 = {P1, P2};
        Project[] l2 = {P1, P3};
        Project[] l3 = {P3, P4};
        Project[] l4 = {P1, P4};

        P2.setTip(Type.Practical);

        Student S1 = new Student("David", l1);
        Student S2 = new Student("Paul", l2);
        Student S3 = new Student("Cosmin", l3);
        Student S4 = new Student("Raul", l4);

        S1.setNume("Robert");

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        System.out.println(S4);
    }
}
