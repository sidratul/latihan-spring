package tutorial.spring.dao;

import java.util.List;
import tutorial.spring.model.Person;

public interface PersonDao {
    public List<Person> getAll();
    public Person getById(long id);
    public void save(Person p);
}
