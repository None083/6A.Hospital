/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author FX506
 */
public class Medico extends Empleado {

    private String especialidad;

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellidos, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico{" + "especialidad=" + especialidad + super.toString() + '}';
    }

    @Override
    public double calcularIRPF() {
        if (this.especialidad.equalsIgnoreCase("cirugía")){
            return super.getSalario() * 25 / 100;
        } else{
            return super.getSalario() * 23.5 / 100;
        }
    }

    private void tratar(Paciente p, String medicina) {
        System.out.println("El medico " + super.getNombre()
                + " trata al paciente  " + p.getNombre() + p.getApellidos()
                + " con la medicina " + medicina);
    }

}
