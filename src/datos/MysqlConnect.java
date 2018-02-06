
package datos;

import java.sql.*;
import org.apache.log4j.Logger;

/**
 *
 * @author Mauricio 
 * @version 2.0
 */

public class MysqlConnect
{
        
    private final static Logger log = Logger.getLogger(MysqlConnect.class);
    
    public Connection conexion = null;
    
    /**
     * 
     * @throws ClassNotFoundException
     * @throws SQLException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public void efectuarConexion() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
    {          
          try
          {            
                final String url = "jdbc:mysql://localhost:3306/";
                final String dbName = "automotores";
                final String driver = "com.mysql.jdbc.Driver";
                final String userName = "root";//
                final String password = "sa4f86";//
                Class.forName(driver).newInstance();
                conexion = DriverManager.getConnection(url+dbName,userName,password); 
                log.info("ACCESO EJECUTADO");
              }
          catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e)
          {
                log.error(e.getMessage());
          }
          
    }

    public ResultSet ejecutarSpConsulta(String args,String storeName) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
            CallableStatement cs = conexion.prepareCall(storeName);  
            cs.setString(1, args);
            cs.execute();
            ResultSet resultado=cs.executeQuery();
            return resultado;
    }
    
    public ResultSet ejecutarSpConsultaSp(String storeName) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {                      
            CallableStatement cs = conexion.prepareCall(storeName);
            ResultSet resultado=cs.executeQuery();
            return resultado;
    }

    /**
     * 
     * @param args
     * @param storeName
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public void ejecutarSpInsercion(String []args, String storeName) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        int tamaño = args.length;
        try (CallableStatement stmt = conexion.prepareCall(storeName)) {
            for (int i = 0; i < tamaño; i++) {
                stmt.setString(i + 1, args[i]);
            }
            stmt.execute();
        }
    }

    public void ejecutarSpActualizar(String []args, String storeName) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        int tamaño = args.length;
        try (CallableStatement stmt = conexion.prepareCall(storeName)) {
            for (int i = 0; i < tamaño; i++) {
                stmt.setString(i + 1, args[i]);
            }
            stmt.execute();
        }
    }
    
    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    
}
