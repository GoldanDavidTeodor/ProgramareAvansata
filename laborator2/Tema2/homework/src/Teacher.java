public class Teacher extends Person{
    private Project[] projects;
    private int numberOfProjects;

    public Teacher(String name, String dateOfBirth) {
        super(name, dateOfBirth);
        this.projects = new Project[10];
        this.numberOfProjects = 0;
    }

    public void newProject(Project project) {
        int deja = 0;
        if(numberOfProjects < 10) {
            for (int i=0; i<10; i++) {
                if (projects[i] != null &&  projects[i].equals(project)) deja = 1;
            }
            if (deja == 0) {
                projects[numberOfProjects] = project;
                numberOfProjects++;
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        return obj instanceof Teacher;
    }

}
