public class Student {
    private String nume;
    private Project[] preferinte;

    public Student(String nume, Project[] preferinte) {
        this.nume = nume;
        this.preferinte = preferinte;
    }

    public String getNume() {
        return this.nume;
    }

    public Project[] getPreferinte() {
        return this.preferinte;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPreferinte(Project[] preferinte) {
        this.preferinte = preferinte;
    }

    @Override
    public String toString() {
        String pref = "Studentul: " + this.nume + " cu preferintele: ";
        int n = preferinte.length;
        for (int i=0; i<n; i++) {
            pref += preferinte[i];
            if (i!=n-1) pref += ", ";
        }
        pref += "\n";
        return pref;
    }


}
