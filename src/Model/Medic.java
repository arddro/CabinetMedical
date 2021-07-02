package Model;

import java.util.Date;

public class Medic {
    private int id;
    private String nume;
    private String prenume;
    private Date data_nastere;
    private String specializare;
    private User user;


    public Medic() {
    }

    public Medic(int id, String nume, String prenume, Date data_nastere, String specializare, User id_user) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.data_nastere = data_nastere;
        this.specializare = specializare;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Date getData_nastere() {
        return data_nastere;
    }

    public void setData_nastere(Date data_nastere) {
        this.data_nastere = data_nastere;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public User getId_user() {
        return user;
    }

    public void setId_user(User id_user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Medic{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", data_nastere=" + data_nastere +
                ", specializare='" + specializare + '\'' +
                ", user=" + user +
                '}';
    }
}
