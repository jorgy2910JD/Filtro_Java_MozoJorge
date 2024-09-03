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
public class mision {
    private BigDecimal rangoM;
    private String recompensa;
    
  public mision (BigDecimal rangoM, String recompensa) {
      this.rangoM = rangoM;
      this.recompensa = recompensa;
  }

    public BigDecimal getRangoM() {
        return rangoM;
    }

    public void setRangoM(BigDecimal rangoM) {
        this.rangoM = rangoM;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }
  
}
