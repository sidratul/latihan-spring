package turotorial.spring.dao.springjdbc;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import turotorial.spring.dao.PersonDao;
import turotorial.spring.model.Person;

@Repository("personDao")
@Transactional(readOnly = true)
public class PersonDaoSpringJdbc implements PersonDao{
    
    private static final Log LOG = LogFactory.getLog(PersonDaoSpringJdbc.class);
    
    private SimpleJdbcTemplate simpleJdbcTemplate;
    private 
    
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
