/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */

// Prueba unitaria manual 

public class Prueba {
    public static void main(String[] args){
        VentaCamisas objetoPrueba = new VentaCamisas();
        float resultado = objetoPrueba.venta(10,10,10); // cantidadCamisas1, cantidadCamisas2, cantidadCamisas3
        System.out.println("El precio final con descuentos incluidos es de: "+ resultado);
    }
    
  
    
    
}
