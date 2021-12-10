/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.chainofresponsibility;

/**
 *
 * @author ronal
 */
public class Trabajador implements AprobadorCambio{
    private AprobarCambio next;
    
    @Override
    public void setNext(AprobadorCambio a){
        }
    
    public boolean aprobarCambio(Articulo a, Fallo f){
        return false;
        }
}
