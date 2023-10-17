/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carreraciclistica;

/**
 *
 * @author YONNATTANTH
 */
public abstract class Ciclista {
    private int identificador; 
    private String nombre; 
    private int tiempoAcumulado = 0; 

    public Ciclista(int identificador, String nombre) {
    this.identificador = identificador;
    this.nombre = nombre;
}
  abstract String imprimirTipo();

protected int getIdentificador() {
return identificador;
}

protected void setIdentificador() {
this.identificador = identificador;
}
protected String getNombre() {
return nombre;
}

protected void setNombre(String nombre) {
this.nombre = nombre;
}

protected int getPosicionGeneral(int posicionGeneral) {
return posicionGeneral;
}

protected void setPosiciónGeneral(int posicionGeneral) {
posicionGeneral = posicionGeneral;
}

protected int getTiempoAcumulado() {
return tiempoAcumulado;
}
protected void setTiempoAcumulado(int tiempoAcumulado) {
this.tiempoAcumulado = tiempoAcumulado;
}

protected void imprimir() {
System.out.println("Identificador = " + identificador);
System.out.println("Nombre = " + nombre);
System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
}
}
