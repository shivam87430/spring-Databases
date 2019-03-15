package question6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class GetUserNameThroughParameterizedQuery {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;


    public String getName() {
        String sql = "SELECT name from user WHERE username=?";
        return (String) jdbcTemplate.queryForObject(sql, new Object[]{"shivam"}, String.class);
    }
}
