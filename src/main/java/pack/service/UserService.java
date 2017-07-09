package pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import pack.dao.UserDAO;
import pack.entity.User;

import java.util.List;


public interface UserService  {



    void save(String userName);

    void save(User user);

     User findOne(int id);

     List<User>findAll();


}
