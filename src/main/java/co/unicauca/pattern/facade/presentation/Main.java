/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.pattern.facade.presentation;

import co.unicauca.pattern.acces.Factory;
import co.unicauca.pattern.acces.IOrderRepository;
import co.unicauca.pattern.domain.order.Customer;
import co.unicauca.pattern.domain.order.Dish;
import co.unicauca.pattern.domain.order.OrderFacade;
import co.unicauca.pattern.domain.order.State;
import co.unicauca.pattern.proxy.IOrderService;
import co.unicauca.pattern.proxy.OrderServiceLogger;
import co.unicauca.pattern.proxy.ProxyClient;

/**
 *
 * @author Rivera
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //El sujeto real.
        OrderFacade facade = new OrderFacade();

        //El objeto proxy. Se le pasa el objeto real por el constructor (inyección)
        IOrderService orderProxy = new OrderServiceLogger(facade);

        //Se opera normal el sujeto real
        facade.createOrder(new Customer(1, "Carlos Sanchez", "Calle 12 No. 12-12 Barrio Caldas", "3115677899", "Popayán"));
        facade.addDish(new Dish(1, "Hamburguesa vegetariana", 5000), 2);
        facade.addDish(new Dish(2, "Hamburguesa sencilla", 4000), 3);
        facade.addDish(new Dish(3, "Jugo hit", 1000), 2);
        System.out.println("Pedido creado");
        facade.changeState(State.CONFIRMED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        facade.changeState(State.DISPACHED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        facade.changeState(State.FINALIZED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        System.out.println("El valor total del pedido es: " + facade.calculateTotal());
        System.out.println("Total de platos pedidos: " + facade.totalDishes());
        
        //Ahora ejecutamos el cliente proxy, y le pasamos el sujeto que debe utilizar.
        ProxyClient client = new ProxyClient(orderProxy);
        client.createOrder();

    }

}
