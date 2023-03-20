/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;

/**
 *
 * @author FX506
 */
public class Nif {
    
    private long numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public Nif(long numero, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
        this.letra = calcularLetra();
    }

    public long getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setNumero(long numero) {
        this.numero = numero;
        this.letra = calcularLetra();
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Nif{" + "numero=" + numero + ", letra=" + letra + ", fechaCaducidad=" + fechaCaducidad + '}';
    }
    
    

    private char calcularLetra(){
     char[] listaLetra=new char[]{'T','R','W','A','G','M','Y',
         'F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
     return listaLetra[((int)(numero)%23)];
    }
    
    public void renovar(LocalDate fecha){
        this.fechaCaducidad = fecha.plusYears(10);
    }
            
}
