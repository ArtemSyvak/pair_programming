package pack.service;

import pack.entity.User;

import java.util.List;


public interface UserService {

    void save(String userName);

    User findOne(int id);

    List<User> findAll();


}
