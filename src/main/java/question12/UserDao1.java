package question12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao1 {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserDao2 userDao2;

   // @Transactional(propagation = Propagation.REQUIRED)
    public void insertUserDao1() {
        String sql = "INSERT INTO People(id,name)VALUES(1,'Shivam')";
        jdbcTemplate.update(sql);

        try{
        userDao2.insertUserDao2();
        }catch (Exception ex){
        }
    }
}
