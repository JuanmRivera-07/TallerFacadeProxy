
package co.unicauca.pattern.proxy;

import co.unicauca.pattern.acces.Factory;
import co.unicauca.pattern.acces.IOrderRepository;



/**
 *
 * @author Rivera
 */
public class ProxyClient {
    private IOrderService orderService;
    
    /**
     * Constructor por defecto
     * @param orderService 
     */
    public ProxyClient(IOrderService orderService){
        this.orderService = orderService;
    }
    /**
     * Crea un nuevo repositorio, y este es enviado a OrderService,
     * por parametros mediante la referencia del objeto orderService
     */
    public void createOrder(){
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        orderService.save(repo);
    }
}
