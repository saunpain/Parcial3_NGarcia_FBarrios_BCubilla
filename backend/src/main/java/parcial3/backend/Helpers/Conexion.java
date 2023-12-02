package parcial3.backend.Helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection openDb(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Parcial3;user=sa;password=1234567890;encrypt=true;trustServerCertificate=true");
        } catch (SQLException e) {
            int x = 1;
        } catch (ClassNotFoundException e) {
            int x = 1;
        }
        return null;
    }
}
