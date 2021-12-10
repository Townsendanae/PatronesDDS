/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.chainofresponsibility;

/**
 *
 * @author ronal
 */
public class JefeInventario extends Trabajador{
    private AprobadorCambio next;
    
    public boolean aprobarCambio(Articulo a, Fallo f){
        return false;
        }
}
