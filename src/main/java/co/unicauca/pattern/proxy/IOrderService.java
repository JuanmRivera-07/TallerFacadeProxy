

package co.unicauca.pattern.proxy;

import co.unicauca.pattern.acces.IOrderRepository;

/**
 *
 * @author Rivera
 */

/**
 * Interfaz de order servicio 
 */
public interface IOrderService {
    
    /**
     * Metodo guardar que utiliza el orderService
     * @param repo repositorio 
     */
    public void save(IOrderRepository repo);
}
