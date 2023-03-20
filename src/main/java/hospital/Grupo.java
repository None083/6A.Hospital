/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package hospital;

/**
 *
 * @author FX506
 */
public enum Grupo {
    
    GRUPOC(0.175), GRUPOD(0.18), GRUPOE(0.185);
    
    private double irpf;

    private Grupo(double irpf) {
        this.irpf = irpf;
    }

    public double getIrpf() {
        return irpf;
    }
    
    
    
}
