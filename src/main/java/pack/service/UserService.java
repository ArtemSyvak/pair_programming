package pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import pack.dao.UserDAO;
import pack.entity.User;

import java.util.List;

@Service
public interface UserService extends UserDetailsService {



    void save(String username);

    void save(User user);

     User findOne(int id);

     List<User>findAll();


}
