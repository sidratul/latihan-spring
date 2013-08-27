package turotorial.spring.dao.springjdbc;

import java.util.List;
import org.springframework.stereotype.Repository;
import turotorial.spring.dao.PersonDao;
import turotorial.spring.model.Person;

@Repository("personDao")
public class PersonDaoSpring implements PersonDao{
    
    @Override
    public List<Person> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Person getById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void save(Person p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
