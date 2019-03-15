import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import question10.UserDetailsThroughRowMapper;
import question11.GetUserThroughSpringORM;
import question12.UserDao1;
import question12.UserDao3;
import question4.UserAccessThroughSingleConnectionDatasource;
import question5.UserAccessThroughJdbcTemplate;
import question6.GetUserNameThroughParameterizedQuery;
import question7.InsertUsingJdbcTemplate;
import question7.user;
import question8.QueryForMap;
import question9.QueryForList;
import userdao.Question3.UserDAO;

import java.sql.SQLException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException {
        /*Question 3*/
/*
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDAO userDAO = applicationContext.getBean(UserDAO.class);
        userDAO.printUserInfo();

        System.out.println("\n");
        UserDAO userDAO1 = applicationContext.getBean(UserDAO.class);
        userDAO1.printUserInfoThroughDbcp2();

        //Question 4
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("spring-config.xml");
        UserAccessThroughSingleConnectionDatasource userAccessThroughSingleConnectionDatasource =
                applicationContext1.getBean(UserAccessThroughSingleConnectionDatasource.class);
        userAccessThroughSingleConnectionDatasource.printUserInfoThroughSingleDatasource();

        //Question 5
        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("spring-config.xml");
        UserAccessThroughJdbcTemplate userAccessThroughJdbcTemplate = applicationContext2.getBean(UserAccessThroughJdbcTemplate.class);
        Integer count = userAccessThroughJdbcTemplate.UserCount();
        System.out.println("Count is :" + count);


        //Question 6
        ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("spring-config.xml");
        GetUserNameThroughParameterizedQuery getUserNameThroughParameterizedQuery = applicationContext3.getBean(GetUserNameThroughParameterizedQuery.class);
        String str = getUserNameThroughParameterizedQuery.getName();
        System.out.println("Name is :" + str);



        //Question 7
       ApplicationContext applicationContext4=new ClassPathXmlApplicationContext("spring-config.xml");
        InsertUsingJdbcTemplate insertUsingJdbcTemplate=applicationContext4.getBean(InsertUsingJdbcTemplate.class);
        user user=new user();
        user.setUsername("vineet");
        user.setPassword("vineet");
        user.setName("Vineet");
        user.setAge(12);
        user.setDob(new Date());
        //insertUsingJdbcTemplate.insertUser(user);
        insertUsingJdbcTemplate.getUser();

        //Question 8
        ApplicationContext applicationContext5 = new ClassPathXmlApplicationContext("spring-config.xml");
        QueryForMap queryForMap = applicationContext5.getBean(QueryForMap.class);
        queryForMap.userDetails();

        //Question 9
        ApplicationContext applicationContext6=new ClassPathXmlApplicationContext("spring-config.xml");
        QueryForList queryForList=applicationContext6.getBean(QueryForList.class);
        queryForList.userDetailsThroughQueryForList();

        //Question 10
        ApplicationContext applicationContext7=new ClassPathXmlApplicationContext("spring-config.xml");
        UserDetailsThroughRowMapper userDetailsThroughRowMapper=applicationContext7.getBean(UserDetailsThroughRowMapper.class);
        user=userDetailsThroughRowMapper.getUserDetails();
        System.out.println(user);
        */

        //Question 11
        /*ApplicationContext applicationContext8=new ClassPathXmlApplicationContext("spring-config.xml");
        GetUserThroughSpringORM getUserThroughSpringORM=applicationContext8.getBean(GetUserThroughSpringORM.class);
        getUserThroughSpringORM.getUserDetailsThroughORM();*/
        ApplicationContext applicationContext9=new ClassPathXmlApplicationContext("spring-config.xml");
        UserDao3 userDao3=applicationContext9.getBean(UserDao3.class);
        userDao3.insertUserDao3();
    }
}
