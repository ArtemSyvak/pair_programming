package pack.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import pack.entity.User;

import java.util.List;


public interface UserService extends UserDetailsService{

    void save(User user);

    User findOne(int id);

    List<User> findAll();


}
