package question4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;

@Service
public class UserAccessThroughSingleConnectionDatasource {
    @Autowired
    DataSource singledataSource;
    public void printUserInfoThroughSingleDatasource() throws SQLException {
        Connection connection=singledataSource.getConnection();
        PreparedStatement preparedStatement= connection.prepareStatement("select * from user");
        ResultSet rs=preparedStatement.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("username"));
            System.out.println(rs.getInt("age"));
            System.out.println(rs.getDate("dob"));

        }
    }
}
