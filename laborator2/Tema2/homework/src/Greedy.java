public class Greedy {
    private Student[] students;
    private Teacher[] teachers;
    private Project[] projects;
    private int nrOfStudents;
    private int nrOfTeachers;
    private int nrOfProjects;

    public Greedy(int nrOfStudents, int nrOfTeachers, int nrOfProjects) {
        students = new Student[nrOfStudents];
        teachers = new Teacher[nrOfTeachers];
        projects = new Project[nrOfProjects];
        this.nrOfProjects = this.nrOfStudents = this.nrOfTeachers = 0;
    }

    public void newStudent(Student student) {
        for (int i=0; i<nrOfStudents; i++) {
            if (students[i].equals(student)) return;
        }
        students[nrOfStudents] = student;
        nrOfStudents++;
    }

    public void newTeacher(Teacher teacher) {
        for (int i=0; i<nrOfTeachers; i++) {
            if (teachers[i].equals(teacher)) return;
        }
        teachers[nrOfTeachers] = teacher;
        nrOfTeachers++;
    }

    public void newProject(Project project) {
        for (int i=0; i<nrOfProjects; i++) {
            if (projects[i].equals(project)) return;
        }
        projects[nrOfProjects] = project;
        nrOfProjects++;
    }

    public void allocate() {
        for (int i=0; i<nrOfStudents && i<nrOfProjects; i++) {
            System.out.println("The student " + students[i].name + " has been assigned the project: " + projects[i].name + "\n");
        }
    }


}

