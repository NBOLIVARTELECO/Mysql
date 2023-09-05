
package ejemplomysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Operaciones {
    
    final String  tabla = "ESTUDIANTES";
    
    public void guardar(Connection conexion){
        try {

            PreparedStatement consulta;

            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla
                    + "(CEDULA, NOMBRE, TELEFONO) VALUES(?,?,?)");

            consulta.setString(1, "10101");
            consulta.setString(2, "nestor");
            consulta.setInt(3, 3434434);

            consulta.executeUpdate();

            System.out.println("Escritura exitosa");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
