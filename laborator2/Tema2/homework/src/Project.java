public class Project {
    public String name;
    private Teacher proposedBy;

    public Project(String name, Teacher proposedBy) {
        this.name = name;
        this.proposedBy = proposedBy;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Project)) return false;
        Project project = (Project) obj;
        return name.equals(project.name) && proposedBy.equals(project.proposedBy);
    }
}
