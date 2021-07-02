package Dao;

import Model.User;

import java.sql.*;

public class UserDao {


    static String connectionUrl = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String user = "root";
    private static final String password = "daniel";


    public User findByUsernameAndParola(String username, String parola) {
        User utilizator = new User();
        String query = ("select id, username, parola, tip_user from utilizator" +
                " where utilizator.username = '" +username+"'" +
                "and utilizator.parola = '" +parola+"'");


        try {
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                utilizator.setId(resultSet.getInt("id"));
                utilizator.setUsername(resultSet.getString("username"));
                utilizator.setParola(resultSet.getString("parola"));
                utilizator.setTip_user(resultSet.getString("tip_user"));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return utilizator;


    }
    public User findByUsername(String username) {
        User utilizator = new User();
        String query = ("select id, username, parola, tip_user from utilizator" +
                " where utilizator.username = '" +username+"'");


        try {
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                utilizator.setId(resultSet.getInt("id"));
                utilizator.setUsername(resultSet.getString("username"));
                utilizator.setParola(resultSet.getString("parola"));
                utilizator.setTip_user(resultSet.getString("tip_user"));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return utilizator;


    }

    public void save (User utilizator){

            String query = "INSERT into utilizator(username, parola, tip_user) VALUES (?,?,?)";

            PreparedStatement preparedStatement = null;
            try {
                Connection connection = DriverManager.getConnection(connectionUrl, user, password);
                preparedStatement = connection.prepareStatement(query);

                preparedStatement.setString(1, utilizator.getUsername());;
                preparedStatement.setString(2, utilizator.getParola());
                preparedStatement.setString(3, utilizator.getTip_user());

                preparedStatement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();

            }
        }

    }



