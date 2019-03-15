package userdao.Question3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserDAO {

    @Autowired
    DataSource dataSource;

    @Autowired
    DataSource dbcp2datasource;

    public void printUserInfo() throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Name is : " + resultSet.getString("name"));
            System.out.println("Password is : " + resultSet.getString("password"));
            System.out.println("Age is : " + resultSet.getInt("age"));
            System.out.println("DOB is : " + resultSet.getString("dob"));
        }
    }

    public void printUserInfoThroughDbcp2() throws SQLException {
        Connection connection=dbcp2datasource.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("SELECT name,age from user where username='dbcp2'");
        ResultSet resultSet=preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getInt("age"));
        }

    }
}
