package question7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class InsertUsingJdbcTemplate {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertUser(user user){
        String sql="INSERT into user (username, password, name, age, dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{
                user.getUsername(),user.getPassword(),user.getName(),user.getAge(),user.getDob()
        });
    }

    public void getUser(){
        String sql="SELECT * from user WHERE username=?";
        System.out.println(jdbcTemplate.queryForMap(sql,new Object[]{"vineet"}));
    }
}
