package co.unicauca.pattern.proxy;

import co.unicauca.pattern.acces.IOrderRepository;
import co.unicauca.pattern.domain.order.OrderFacade;
import java.lang.System.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Rivera
 */
public class OrderServiceLogger implements IOrderService {
    
    /**
     * Referencia de la clase OrderFacade
     */
    private OrderFacade orderFacade;
    
    /**
     * constructor parametrizado
     * @param orderFacade, parametro que se usa para acceder a los 
     * metodos de la clase OrderFacade
     */
    public OrderServiceLogger(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }
    
    /**
     * Metodo implementado de la interfaz IOrderService
     * accede al metodo save de la clase OrderFacade para simular
     * el guardado de un plato
     * @param repo repositorio que se usa para simular el guardado de los platos
     */
    @Override
    public void save(IOrderRepository repo) {
   
        orderFacade.save(repo);
        org.slf4j.Logger logger = LoggerFactory.getLogger(OrderServiceLogger.class);
        String message = "Pedido guardado en la base de datos";
        logger.info(message);   
    }

}
