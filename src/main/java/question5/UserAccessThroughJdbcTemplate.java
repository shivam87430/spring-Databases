package question5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserAccessThroughJdbcTemplate {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int UserCount(){
        String sql="SELECT COUNT(*) from user";
        return (Integer)jdbcTemplate.queryForObject(sql,Integer.class);
    }
}
