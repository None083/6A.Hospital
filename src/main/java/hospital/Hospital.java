/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FX506
 */
public class Hospital {
    
    private String nombre;
    private String direccion;
    private int numeroCamas;
    private List<Paciente> listaPacientes;
    private List<Empleado> listaEmpleados;

    public Hospital(String nombre, String direccion, int numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.listaPacientes = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    @Override
    public String toString() {
        return "Hosp\u00ectal{" + "nombre=" + nombre + ", direccion=" + direccion + ", numeroCamas=" + numeroCamas + ", listaPacientes=" + listaPacientes + ", listaEmpleados=" + listaEmpleados + '}';
    }

    public void contratarEmpleado(Empleado m){
        this.listaEmpleados.add(m);
    }
    
    public void ingresarPaciente(Paciente p){
        this.listaPacientes.add(p);
    }
    
}
