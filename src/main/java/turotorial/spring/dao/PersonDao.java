/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turotorial.spring.dao;

import java.util.List;
import turotorial.spring.model.Person;

public interface PersonDao {
    public List<Person> getAll();
    public Person getById(long id);
    public void save(Person p);
}
