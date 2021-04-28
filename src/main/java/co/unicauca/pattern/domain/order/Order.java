
package co.unicauca.pattern.domain.order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rivera
 */
public class Order {
    
    public int despatch;
    private Customer customer;
    private LocalDate date;
    private State state;
    private List<Item> details = new ArrayList<Item>();

    public Order() {
    }
    
    
    public Order(Customer customer){
        this.customer = customer;
    }

    public int getDespatch() {
        return despatch;
    }

    public void setDespatch(int despatch) {
        this.despatch = despatch;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Item> getDetails() {
        return details;
    }

    public void setDetails(List<Item> details) {
        this.details = details;
    }
    
    /**
     * agrega un nuevo plato a la orden
     * @param dish plato
     * @param amount cantidad de platos
     */
    public void addDish(Dish dish, int amount){
        this.state = State.NEW;
        Item miItem = new Item(dish, amount);
        this.details.add(miItem);
    }
    
    /**
     * calcula el costo total de la orden
     * deacuerdo a la cantidad de platos por su respectivo valor
     * @return valor total
     */
    public int calculate(){
        int total = 0;
        for(Item iter : this.details){
            total += (iter.getDish().getPrice() * iter.getAmount());
        }
        return total;
    }
    
}
