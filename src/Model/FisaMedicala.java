package Model;

public class FisaMedicala {

    private int id;
    private Pacient pacient;
    private Medic medic;
    private String diagnostic;
    private String tratament;

    public FisaMedicala() {
    }

    public FisaMedicala(int id, Pacient pacient, Medic medic, String diagnostic, String tratament) {
        this.id = id;
        this.pacient = pacient;
        this.medic = medic;
        this.diagnostic = diagnostic;
        this.tratament = tratament;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public Medic getMedic() {
        return medic;
    }

    public void setMedic(Medic medic) {
        this.medic = medic;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getTratament() {
        return tratament;
    }

    public void setTratament(String tratament) {
        this.tratament = tratament;
    }

    @Override
    public String toString() {
        return "FisaMedicala{" +
                "id=" + id +
                ", pacient=" + pacient +
                ", medic=" + medic +
                ", diagnostic='" + diagnostic + '\'' +
                ", tratament='" + tratament + '\'' +
                '}';
    }
}
