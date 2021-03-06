package pack.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pack.dao.UserDAO;
import pack.entity.User;
import pack.service.UserService;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    public void save(User user) {
        userDAO.save(user);
    }
    public void save(String username) {
        userDAO.save(new User(username));
    }

    public User findOne(int id) {
        return userDAO.findOne(id);
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDAO.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("username: " + username + " not found!");
        }
        return user;
    }


}
