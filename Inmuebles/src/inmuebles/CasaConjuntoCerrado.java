/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author YONNATTANTH
 */
public class CasaConjuntoCerrado extends CasaUrbana {
    protected static double valorArea = 2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos; 
  
  public CasaConjuntoCerrado(int identificadorInmobiliario, int area,
String direccion, int numeroHabitaciones, int numeroBaños,
int numeroPisos, int valorAdministracion, boolean tienePiscina,
boolean tieneCamposDeportivos) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
this.valorAdministracion = valorAdministracion;
this.tienePiscina = tienePiscina;
this.tieneCamposDeportivos = tieneCamposDeportivos;
}
 void imprimir() {
super.imprimir(); 
System.out.println("Valor de la administracion = " + valorAdministracion);
System.out.println("Tiene piscina? = " + tienePiscina);
System.out.println("Tiene campos deportivos? = " + tieneCamposDeportivos);
System.out.println();
} 
}
