package question10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import question7.user;

@Repository
public class UserDetailsThroughRowMapper {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public user getUserDetails(){
        String sql="SELECT * from user WHERE username=?";
       return jdbcTemplate.queryForObject(sql,new Object[]{"shivam"},new UserMapper());
    }
}
