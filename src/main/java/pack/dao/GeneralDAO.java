package pack.dao;

import java.util.List;




public interface GeneralDAO <E> {

    void save(E e);

    E findOne(int id);

    List<E> findAll ();

}
