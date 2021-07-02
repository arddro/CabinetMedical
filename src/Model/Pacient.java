package Model;

import java.util.Date;

public class Pacient {

    private int id;
    private String nume;
    private String prenume;
    private Date data_nastere;
    private User user;

    public Pacient() {
    }

    public Pacient(int id, String nume, String prenume, Date data_nastere, User id_utiliz) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.data_nastere = data_nastere;
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

    public User getId_utiliz() {
        return user;
    }

    public void setId_utiliz(User id_utiliz) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", data_nastere=" + data_nastere +
                ", user=" + user +
                '}';
    }
}
