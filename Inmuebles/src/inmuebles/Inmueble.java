/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author YONNATTANTH
 */
public class Inmueble {
    protected int identificadorInmobiliario;
    protected int area; 
    protected String direccion; 
    protected double precioVenta;
    
    Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
}

double calcularPrecioVenta(double valorArea) {
precioVenta = area * valorArea;
return precioVenta;
}

void imprimir() {
System.out.println("Identificador inmobiliario = " + identificadorInmobiliario);
System.out.println("Area = " + area);
System.out.println("Dirección = " + direccion);
System.out.println("Precio de venta = $" + precioVenta);
}
}
