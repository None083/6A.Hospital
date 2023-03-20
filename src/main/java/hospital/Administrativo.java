/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author FX506
 */
public class Administrativo extends Empleado {
    
    private Grupo grupo;

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellidos, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.grupo = grupo;
    }

    @Override
    public double calcularIRPF() {
        return grupo.getIrpf()*super.getSalario();
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "grupo=" + grupo + super.toString() +'}';
    }
    
    
    
}
