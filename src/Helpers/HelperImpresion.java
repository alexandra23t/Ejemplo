/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Solicitud;

/**
 *
 * @author samma
 */
public class HelperImpresion {
    public static void ImprimirPersona(Solicitud obj_Solicitud)
    {
         System.out.println("El nombre de la actividad es:"+"\t"+obj_Solicitud.getObjActividad().getNombre());
        System.out.println("la descripcion es:"+"\t"+obj_Solicitud.getObjActividad().getDescripcion());
        System.out.println("el solicitante es:"+"\t"+obj_Solicitud.getSolicitante());
        System.out.println("el codigo es:"+"\t"+obj_Solicitud.getCodigo());
        System.out.println("el numero de cedula es:"+"\t"+obj_Solicitud.getCedula());
        System.out.println("el id es:"+"\t"+obj_Solicitud.getObjActividad().getId());
    }
}
      
    

    
    
