package pack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pack.entity.User;

/**
 * Created by Artem on 09.07.2017.
 */
public interface UserDAO extends JpaRepository <User, Integer> {

}
