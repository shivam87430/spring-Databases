package question8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QueryForMap {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void userDetails(){
        String sql="SELECT * from user WHERE username=?";
        System.out.println(jdbcTemplate.queryForMap(sql,new Object[]{"vineet"}));
    }
}
