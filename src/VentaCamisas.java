/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class VentaCamisas {
    int cantidadCamisas1; // Camisa 1 - Camisa de manga corta
    int cantidadCamisas2; // Camisa 2 - Camisa casual de manga larga
    int cantidadCamisas3; // Camisa 3 - Camisa formal de manga larga
    public int totalCamisas;
    float ventaTotal;
    
    float precioCamisa1 = 190.0f;
    float precioCamisa2 = 230.0f;
    float precioCamisa3 = 310.0f;

    public float venta(int cantidadCamisas1, int cantidadCamisas2, int cantidadCamisas3){
        
        totalCamisas = cantidadCamisas1 + cantidadCamisas2 + cantidadCamisas3;
        ventaTotal = ((cantidadCamisas1 * precioCamisa1) + (cantidadCamisas2 * precioCamisa2) + (cantidadCamisas3 * precioCamisa3));
        
        if (totalCamisas >= 3 && totalCamisas <= 5){
            return (((cantidadCamisas1 * precioCamisa1) + (cantidadCamisas2 * precioCamisa2) + (cantidadCamisas3 * precioCamisa3)) * 0.95f);
        }
        else if  (totalCamisas >= 6 ){
            return (((cantidadCamisas1 * precioCamisa1) + (cantidadCamisas2 * precioCamisa2) + (cantidadCamisas3 * precioCamisa3)) * 0.92f);
        }
        else   {
            return ((cantidadCamisas1 * precioCamisa1) + (cantidadCamisas2 * precioCamisa2) + (cantidadCamisas3 * precioCamisa3));
        }     
}
}