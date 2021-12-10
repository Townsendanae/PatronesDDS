/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chainofresponsibility;

/**
 *
 * @author ronal
 */
public interface AprobadorCambio {
    
    public void setNext(AprobadorCambio a);
    
    public boolean aprobarCambio(Articulo a, Fallo F);
    
}
