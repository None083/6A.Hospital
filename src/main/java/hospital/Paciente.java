/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.Random;

/**
 *
 * @author FX506
 */
public class Paciente extends Persona{
    
    private int numeroHistoria;

    public Paciente(int numeroHistoria, String nombre, String apellidos, Nif nif) {
        super(nombre, apellidos, nif);
        this.numeroHistoria = numeroHistoria;
    }


    public int getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(int numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    @Override
    public String toString() {
        return "Paciente{" + "numeroHistoria=" + numeroHistoria + super.toString() +'}';
    }

    public void tomarMedicina(String medicina){
        Random random = new Random();
        Boolean booleanAleatorio = random.nextBoolean();
        if (booleanAleatorio==true){
            System.out.println("El paciente se ha curado :)");
        } else{
            System.out.println("El paciente no se ha curado :(");
        }
    }
    
    
    
}
