package Model;

public class Programare {

    private int id;
    private Medic medic;
    private Pacient pacient;
    private boolean realizata;


    public Programare() {
    }

    public Programare(int id, Medic medic, Pacient pacient, boolean realizata) {
        this.id = id;
        this.medic = medic;
        this.pacient = pacient;
        this.realizata = realizata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medic getMedic() {
        return medic;
    }

    public void setMedic(Medic medic) {
        this.medic = medic;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public boolean isRealizata() {
        return realizata;
    }

    public void setRealizata(boolean realizata) {
        this.realizata = realizata;
    }

    @Override
    public String toString() {
        return "Programare{" +
                "id=" + id +
                ", medic=" + medic +
                ", pacient=" + pacient +
                ", realizata=" + realizata +
                '}';
    }
}
