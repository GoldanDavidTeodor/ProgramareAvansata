public class Project {
    private String nume;
    private Type  tip;

    public Project(String nume, Type tip) {
        this.nume = nume;
        this.tip = tip;
    }

    public String getNume() {
        return this.nume;
    }

    public Type getTip() {
        return this.tip;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setTip(Type tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Proiectul: " + this.nume + " de tipul: " + this.tip + "\n";
    }

}
