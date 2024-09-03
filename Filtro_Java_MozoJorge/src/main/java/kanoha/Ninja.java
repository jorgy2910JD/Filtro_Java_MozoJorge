/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kanoha;
import java.math.BigDecimal;

/**
 *
 * @author camper
 */
public class Ninja {
    private String nombre;
    private BigDecimal rango;
    private String aldea;
    
    public Ninja (String nombre, BigDecimal rango, String aldea){
       this.nombre = nombre;
       this.rango = rango;
       this.aldea = aldea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getRango() {
        return rango;
    }

    public void setRango(BigDecimal rango) {
        this.rango = rango;
    }

    public String getAldea() {
        return aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }
    
    
}
