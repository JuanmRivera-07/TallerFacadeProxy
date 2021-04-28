
package co.unicauca.pattern.domain.order;

import co.unicauca.pattern.acces.IOrderRepository;
import co.unicauca.pattern.proxy.IOrderService;


/**
 *
 * @author Rivera
 */

/**
 * OrderFacade proveen una clase simplificada de un subsistema para ser
 * utilizada por clientes.
 * 
 */
public class OrderFacade implements IOrderService{
    private Order order;
    
    /**
     * constructor por defecto
     */
    public OrderFacade() {
    }

    /**
     * constructor parametrizado
     * @param order 
     */
    public OrderFacade(Order order) {
        this.order = order;
    }
    
    /**
     * Crea una nueva orden asignado a un cliente
     * @param customer objeto cliente
     */
    public void createOrder(Customer customer){
        order = new Order(customer);
    }
    
    /**
     * Agrega un nuevo plato a la lista de platos de un cliente
     * @param dish plato
     * @param amount cantidad de platos
     */
    public void addDish(Dish dish, int amount){
        order.addDish(dish, amount);
    }
    
    /**
     * cambio de estado de una orden
     * @param state estado
     */
    public void changeState(State state){
        order.setState(state);
    }
    
    /**
     * Cambio de estado a cancelado
     */
    public void cancelOrder(){
        order.setState(State.CANCELED);
    }
    
    /**
     * calculo el costo de la orden
     * @return valor total de la orden
     */
    public int calculateTotal(){
        return order.calculate();
    }
    
    /**
     * obtiene una orden
     * @return orden
     */
    public Order getOrder(){
        return this.order;
    }
    
    /**
     * cantidad de platos
     * @return numero de platos del cliente
     */
    public int totalDishes(){
        return order.getDetails().size();
    }
    
    /**
     * simulacion del guardado del palto
     * @param repo repositorio
     */
    @Override
    public void save(IOrderRepository repo){
        boolean guardar = repo.save(repo);
    }
    
}
