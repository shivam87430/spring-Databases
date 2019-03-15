package question12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao2 {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Transactional(propagation = Propagation.SUPPORTS)
    public void insertUserDao2() {
        String sql = "INSERT INTO People(id,name)VALUES(2,'Saxena')";
        jdbcTemplate.update(sql);
       throw new RuntimeException();
    }
}
