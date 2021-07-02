package Dao;

import Model.Pacient;
import Model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacientDao {

    static String connectionUrl = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String user = "root";
    private static final String password = "daniel";

    public void save(Pacient pacient) {

        String query = "INSERT into pacient(nume, prenume, data_nastere, tip_utiliz) VALUES(?,?,?,?)";
        PreparedStatement preparedStatement = null;
        try {
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, pacient.getNume());
            preparedStatement.setString(2, pacient.getPrenume());
            preparedStatement.setDate(3, (Date) pacient.getData_nastere());
            preparedStatement.setInt(4, pacient.getId_utiliz().getId());


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public List<Pacient>getall(){
        List<Pacient>pacientList=new ArrayList<>();
        String query = "select pacient.id, pacient.nume, pacient.prenume, pacient.data_nastere, utilizator.id from pacient\n" +
                "inner join utilizator on pacient.id_utiliz=utilizator.id;";
        try {
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Pacient pacient=new Pacient();
                pacient.setId(resultSet.getInt("id"));
                pacient.setNume(resultSet.getString("nume"));
                pacient.setPrenume(resultSet.getString("prenume"));
                pacient.setData_nastere(resultSet.getDate("data_nastere"));
                User user=new User();
                user.setId(resultSet.getInt("id"));

                pacient.setId_utiliz(user);

                pacientList.add(pacient);

            }

            } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pacientList;


    }

}
