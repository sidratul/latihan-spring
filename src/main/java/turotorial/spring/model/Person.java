/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turotorial.spring.model;

/**
 *
 * @author sidratul
 */
public class Person {
    private long id;
    private String name;
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
