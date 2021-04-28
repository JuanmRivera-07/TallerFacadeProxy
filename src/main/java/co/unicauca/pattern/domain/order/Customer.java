
package co.unicauca.pattern.domain.order;

/**
 *
 * @author Rivera
 */
public class Customer {
    private int id;
    private String name;
    private String adress;
    private String telephone;
    private String city;

    public Customer() {
    }

    public Customer(int id, String name, String adress, String telephone, String city) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.telephone = telephone;
        this.city = city;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    
}
