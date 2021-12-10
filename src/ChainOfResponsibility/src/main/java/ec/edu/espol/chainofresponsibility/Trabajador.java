/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.chainofresponsibility;

/**
 *
 * @author ronal
 */
public abstract class Trabajador implements AprobadorCambio{
    private AprobadorCambio next;
    
    @Override
    public void setNext(AprobadorCambio a){
        next = a;
        }
    
    public boolean aprobarCambio(Articulo a, Fallo f){
        if(next != null) return next.aprobarCambio(a, f);
        return true;
        }
}
