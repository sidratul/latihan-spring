package turotorial.spring.dao.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
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
    private SimpleJdbcInsert simpleJdbcInsert;
    
    private static final String SQL_GET_ALL = "select * from T_PERSON";
    private static final String SQL_GET_BY_ID = "select * from T_PERSON where id=?";
    private static final String SQL_UPDATE = "UPDATE T_PERSON set name=? , email=? where id=?";
    
    private static final class PersonMapper implements 
            ParameterizedRowMapper<Person>{
        
        @Override
        public Person mapRow(final ResultSet rs,final int rowNum) 
                throws SQLException {
            final Person result = new Person();
            //result.setId
        }
    
    }
    
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
