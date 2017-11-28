/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiproyecto.Registros_Semanticos;

import java.util.ArrayList;


public class RS_Funcion {
    
    private String nombre;
    private String tipo;
    private ArrayList<RS_Parametro> parametros;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<RS_Parametro> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<RS_Parametro> parametros) {
        this.parametros = parametros;
    }
    
    
}
