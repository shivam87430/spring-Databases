package question10;


import org.springframework.jdbc.core.RowMapper;
import question7.user;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<user> {
    @Override
    public user mapRow(ResultSet rs, int rowNum) throws SQLException {
        user user=new user();
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setName(rs.getString("name"));
        user.setAge(rs.getInt("age"));
        user.setDob(rs.getDate("dob"));

        return user;
    }
}
