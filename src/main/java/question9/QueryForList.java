package question9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QueryForList {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void userDetailsThroughQueryForList(){
        String sql="SELECT * from user";
        System.out.println(jdbcTemplate.queryForList(sql));
    }
}
