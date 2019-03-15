package question12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao3 {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(noRollbackFor = ArithmeticException.class)
    public void insertUserDao3() {
        String sql = "INSERT INTO People(id,name)VALUES(3,'Vineet')";
        jdbcTemplate.update(sql);
        int i=1/0;
        System.out.println(i);
        //throw new RuntimeException();
    }
}
