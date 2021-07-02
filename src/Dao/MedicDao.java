package Dao;

import Model.Medic;

import java.sql.*;

public class MedicDao {

    static String connectionUrl = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String user = "root";
    private static final String password = "daniel";

    public void save(Medic medic) {

        String query = "INSERT into medic(nume, prenume, data_nastere, specializare, id_user) VALUES (?,?,?,?,?)";

        PreparedStatement preparedStatement = null;
        try {
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, medic.getNume());
            preparedStatement.setString(2, medic.getPrenume());
            preparedStatement.setDate(3, (Date) medic.getData_nastere());
            preparedStatement.setString(4, medic.getSpecializare());

            preparedStatement.setInt(5, medic.getId_user().getId());


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
