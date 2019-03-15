package question11;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GetUserThroughSpringORM {
    @Autowired
    SessionFactory sessionFactory;

    public void getUserDetailsThroughORM() {
        String sql = "SELECT count(*) from user";
        Query query = sessionFactory.openSession().createQuery(sql);
        System.out.println(query.uniqueResult());
    }
}
