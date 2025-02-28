/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author samma
 */
public class Solicitud {

    private String solicitante;
    private String cedula;
    private String codigo;
    Actividad objActividad;

    public Solicitud() {
    }

    public Solicitud(String solicitante, String cedula, String codigo, Actividad objActividad) {
        this.solicitante = solicitante;
        this.cedula = cedula;
        this.codigo = codigo;
        this.objActividad = objActividad;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Actividad getObjActividad() {
        return objActividad;
    }

    public void setObjActividad(Actividad objActividad) {
        this.objActividad = objActividad;
    }

    

   

}
