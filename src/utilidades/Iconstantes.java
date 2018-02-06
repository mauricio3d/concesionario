/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author Mauricio 
 * @version 2.0
 */
public interface Iconstantes {
    public final String sp_insertarcliente = "{CALL sp_insertarcliente(?,?,?,?,?,?,?)}";
    public final String sp_actualizacliente = "{CALL sp_actualizacliente(?,?,?,?,?,?,?)}";
    public final String sp_consultaclientenombre = "{CALL sp_consultaclientenombre(?)}";
    public final String sp_consultarcliente = "{CALL sp_consultarcliente()}";
}

