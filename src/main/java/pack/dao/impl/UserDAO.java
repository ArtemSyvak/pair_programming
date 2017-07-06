package pack.dao.impl;

import org.springframework.stereotype.Repository;
import pack.dao.GeneralDAO;
import pack.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;



@Repository
public class UserDAO implements GeneralDAO<User> {

    @PersistenceContext
    private EntityManager manager;

    public void save(User user) {
        manager.persist(user);
    }

    public User findOne(int id) {
        return manager.find(User.class, id);
    }

    public List findAll() {
        return manager.createQuery("select u from User u", User.class).getResultList();
    }
}
