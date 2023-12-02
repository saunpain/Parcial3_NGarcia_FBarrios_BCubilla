package parcial3.backend.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import parcial3.backend.Entities.Texto;
import parcial3.backend.Helpers.Conexion;

public class TextoDb {
    
    private Connection cn;

    public TextoDb(){
        this.cn = new Conexion().openDb();
    }

    public List<Texto> ObtenerTodosLosTextos(){
        List<Texto> textos = new ArrayList<>();

        try {
            Statement stmt = cn.createStatement();
            String query = "SELECT * FROM Texto";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                Texto texto = new Texto(
                    rs.getString("cod_texto"),
                    rs.getInt("cod_titulos"),
                    rs.getString("texto")
                );

                textos.add(texto);
            }

            stmt.close();
            rs.close();
        } catch (Exception e) {
            
        }
        return textos;
    }
}
