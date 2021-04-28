/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.pattern.acces;

/**
 *
 * @author Rivera
 */

/**
 * Clase que implementa los metodos de la interfaz IOrderRepository
 */
public class OrderRepository implements IOrderRepository{
    
    /**
     * metodo que guarda en un repositorio
     * @param repo repositorio 
     * @return boolean
     */
    @Override
    public boolean save(IOrderRepository repo) {
        return true;
    }
    
}
