/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperValidacion;
import Logica_Negocio.Actividad;
import Logica_Negocio.Solicitud;
import java.util.Scanner;

/**
 *
 * @author samma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre, descripcion, solicitud,codigo, cedula, id;
        
        Scanner sc = new Scanner(System.in);
        Solicitud obj_solicitud;
        Actividad obj_actividad;
        int rta, conteo;

        System.out.println("Cual es el nombre de la actividad");
        nombre = sc.nextLine();

        rta = HelperValidacion.ValidarVacio(nombre);

        while (rta > 0) {
            System.out.println("Cual es el nombre de la actividad");
            nombre = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(nombre);
        }

        conteo = HelperValidacion.ValidarTodo(nombre);

        while (conteo != 0) {
            System.out.println("cual es el nombre de la actividad");
            nombre = sc.nextLine();
            conteo = HelperValidacion.ValidarTodo(nombre);

        }
        
          System.out.println("ingrese el ID");
        id = sc.nextLine();

        rta = HelperValidacion.ValidarVacio(id);

        while (rta > 0) {
            System.out.println("Cual es el nombre de la actividad");
            id = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(id);
        }

        conteo = HelperValidacion.ValidarTodoSerial(id);

        while (conteo != 0) {
            System.out.println("cual es el nombre de la actividad");
            id = sc.nextLine();
            conteo = HelperValidacion.ValidarTodoSerial(id);

        }

        System.out.println("ingrese la descripcion");
        descripcion = sc.nextLine();

        rta = HelperValidacion.ValidarVacio(descripcion);

        while (rta > 0) {
            System.out.println("ingrese la descripcion");
            descripcion = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(descripcion);
        }

        conteo = HelperValidacion.ValidarTodo(descripcion);

        while (conteo != 0) {
            System.out.println("ingresar la descripcion");
            descripcion = sc.nextLine();
            conteo = HelperValidacion.ValidarTodo(descripcion);

        }
        obj_actividad = new Actividad(nombre, id, descripcion);
        System.out.println("ingrese el solicitante");
        solicitud = sc.nextLine();

        rta = HelperValidacion.ValidarVacio(solicitud);

        while (rta > 0) {
            System.out.println("ingrese el solicitante");
            solicitud = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(solicitud);
        }

        conteo = HelperValidacion.ValidarTodo(solicitud);

        while (conteo != 0) {
            System.out.println("ingrese el solicitante");
            solicitud = sc.nextLine();
            conteo = HelperValidacion.ValidarTodo(solicitud);

        }

        System.out.println("Cual es el codigo");
        codigo = sc.nextLine();

        rta = HelperValidacion.ValidarVacio(codigo);

        while (rta > 0) {
            System.out.println("Cual es el codigo");
            codigo = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(codigo);
        }

        conteo = HelperValidacion.ValidarTodoSerial(codigo);

        while (conteo != 0) {
            System.out.println("cual es el codigo");
            codigo = sc.nextLine();
            conteo = HelperValidacion.ValidarTodoSerial(codigo);

        }

        System.out.println("ingrese la cedula");
        cedula = sc.nextLine();

        rta = HelperValidacion.ValidarVacio(cedula);

        while (rta > 0) {
            System.out.println("ingrese la cedula");
            cedula = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(cedula);
        }

        conteo = HelperValidacion.ValidarTodoLetra(cedula);

        while (conteo != 0) {
            System.out.println("ingrese la cedula");
            cedula = sc.nextLine();
            conteo = HelperValidacion.ValidarTodoLetra(cedula);

        }
        
        obj_solicitud = new Solicitud(solicitud, cedula, codigo, obj_actividad);

       Helpers.HelperImpresion.ImprimirPersona(obj_solicitud);

    }

}
