/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsibility;

/**
 *
 * @author ronal
 */
public class MiembroDepartamentoTecnico extends Trabajador{
    private AprobadorCambio next;
    
    public void setNext(AprobadorCambio a){
        }
    
    public boolean aprobarCambio(Articulo a, Fallo f){
        return false;
        }
    
}
