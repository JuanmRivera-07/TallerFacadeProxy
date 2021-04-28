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
public class Factory {
    
    private static Factory instance;

    private Factory() {
    }

    /**
     * Patron de diseño singleton, getInstance crea un unico objeto en el que se
     * manejara el repositorio y esta girara tan solo a este objeto en caso de
     * que ya existe
     *
     * @return el objeto instance ya creado.
     */
    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }
    /**
     * 
     * @param type es el tipo de objeto del que se quiere crear.
     * @return objeto de tipo repositry
     */
    public IOrderRepository getRepository(String type) {
        IOrderRepository result = null;
        switch (type) {
            case "default":
                result = new OrderRepository();
                break;
        }
        return result;
    }
}
