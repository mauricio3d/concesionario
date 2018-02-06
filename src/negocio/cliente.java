/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static utilidades.Iconstantes.sp_actualizacliente;
import static utilidades.Iconstantes.sp_consultaclientenombre;
import static utilidades.Iconstantes.sp_consultarcliente;
import static utilidades.Iconstantes.sp_insertarcliente;

/**
 *
 * @author Mauricio 
 * @version 2.0
 */
public class cliente {
    
    public static void ejecutarCliente(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        MysqlConnect instConexion = new MysqlConnect();
        try {    
            instConexion.efectuarConexion();
            instConexion.ejecutarSpInsercion(args, sp_insertarcliente);
        } finally{
            //Codigo para cerrar la conexion
        }
    }
    public static void ejecutarActualizar(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        MysqlConnect instConexion = new MysqlConnect();
        instConexion.efectuarConexion();
        instConexion.ejecutarSpActualizar(args, sp_actualizacliente);
    }
    
    public static String[] ejecutarConsulta(String args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        MysqlConnect instConexion = new MysqlConnect();
        instConexion.efectuarConexion();
        ResultSet resultado = instConexion.ejecutarSpConsulta(args, sp_consultaclientenombre);
        resultado.next();
        String arr[] = new String[5];
        arr[0] = resultado.getString(1) + " - ";
        arr[1] = resultado.getString(2) + " - ";
        arr[2] = resultado.getString(3) + " - ";
        arr[3] = resultado.getString(4) + " - ";
        arr[4] = resultado.getString(5);
        return arr;
    }
    
    public static List<String> ejecutarConsultaTotal() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        MysqlConnect instConexion = new MysqlConnect();
        instConexion.efectuarConexion();
        ResultSet resultado = instConexion.ejecutarSpConsultaSp(sp_consultarcliente);
        List<String> partList = new ArrayList<>(1);
        int colum = 1;
        resultado.next();
        int rowCount = resultado.getRow();
        while (rowCount > 0) {
            partList.add(resultado.getString(colum));
            colum++;
            if (colum == 6) {
                if (resultado.next()) {
                    rowCount = resultado.getRow(); 
                    colum = 1;
                } else {
                    rowCount = 0;    
                }
            }
        }
        return partList;
    }
}
