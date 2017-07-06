package pack.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pack.dao.GeneralDAO;
import pack.entity.User;
import pack.service.UserService;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private GeneralDAO<User> userGeneralDAO;

    public GeneralDAO<User> getUserGeneralDAO() {
        return userGeneralDAO;
    }

    public void setUserGeneralDAO(GeneralDAO<User> userGeneralDAO) {
        this.userGeneralDAO = userGeneralDAO;
    }

    public void save(String userName) {
        userGeneralDAO.save(new User(userName));
    }

    public User findOne(int id) {
        return  userGeneralDAO.findOne(id);
    }

    public List<User> findAll() {
        return userGeneralDAO.findAll();
    }
}
