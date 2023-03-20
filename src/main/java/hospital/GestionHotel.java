/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class GestionHotel {

    public static void main(String[] args) {

        Hospital h1 = new Hospital("Central", "Calle Dolores Fuertes", 1589);
        
//        h1.contratarEmpleado(crearMedico());
//        h1.contratarEmpleado(crearMedico());
        
        h1.contratarEmpleado(crearPersonalPAS());
//        h1.contratarEmpleado(crearPersonalPAS());
//        h1.contratarEmpleado(crearPersonalPAS());
        
//        h1.ingresarPaciente(crearPaciente());
//        h1.ingresarPaciente(crearPaciente());
//        h1.ingresarPaciente(crearPaciente());
//        h1.ingresarPaciente(crearPaciente());
//        h1.ingresarPaciente(crearPaciente());
        
        System.out.println(h1);
        
    }

    private static Paciente crearPaciente() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de historia");
        int numeroHistoria = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduce el nombre del paciente");
        String nombrePaciente = teclado.nextLine();
        System.out.println("Introduce los apellidos del paciente");
        String apellidosPaciente = teclado.nextLine();
        System.out.println("Introduce los numero del nif del paciente");
        Long numeros = teclado.nextLong();
        Nif nifPaciente = new Nif(numeros, LocalDate.now());
        Paciente p1 = new Paciente(numeroHistoria, nombrePaciente, apellidosPaciente, nifPaciente);
        return p1;
    }

    private static Medico crearMedico() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la especialidad");
        String especialidad = teclado.nextLine();
        System.out.println("Introduce el número de Seguridad Social");
        String numeroSSocial = teclado.nextLine();
        System.out.println("Introduce el salario del médico");
        double salario = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Introduce el nombre del médico");
        String nombreMedico = teclado.nextLine();
        System.out.println("Introduce los apellidos del médico");
        String apellidosMedico = teclado.nextLine();
        System.out.println("Introduce los numero del nif del médico");
        Long numeros = teclado.nextLong();
        Nif nifMedico = new Nif(numeros, LocalDate.now());
        Medico m1 = new Medico(especialidad, numeroSSocial, salario, nombreMedico, apellidosMedico, nifMedico);
        return m1;
    }

    private static Administrativo crearPersonalPAS() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige grupo C, D o E");
        String especialidad = teclado.nextLine();
        Grupo grupo;
        switch (especialidad) {
            case "C":
                grupo = Grupo.GRUPOC;
            break;
            case "D":
                grupo = Grupo.GRUPOD;
            break;
            case "E":
                grupo = Grupo.GRUPOE;
            break;
            default:
                grupo = Grupo.GRUPOC;
        }
        System.out.println("Introduce el número de Seguridad Social");
        String numeroSSocial = teclado.nextLine();
        System.out.println("Introduce el salario");
        double salario = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Introduce el nombre");
        String nombre = teclado.nextLine();
        System.out.println("Introduce los apellidos");
        String apellidos = teclado.nextLine();
        System.out.println("Introduce los numero del nif");
        Long numeros = teclado.nextLong();
        Nif nif = new Nif(numeros, LocalDate.now());
        Administrativo a1 = new Administrativo(grupo, numeroSSocial, salario, nombre, apellidos, nif);
        return a1;
    }

}
