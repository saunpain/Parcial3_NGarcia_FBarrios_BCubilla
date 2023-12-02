package parcial3.backend.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import parcial3.backend.Entities.Imagenes;
import parcial3.backend.Helpers.Conexion;

public class ImagenesDb {
    
    private Connection cn;

    public ImagenesDb(){
        this.cn = new Conexion().openDb();
    }

    public List<Imagenes> ObtenerTodasLasImagenes(){
        List<Imagenes> imagenes = new ArrayList<>();

        try {
            Statement stmt = cn.createStatement();
            String query = "SELECT * FROM Imagenes";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                Imagenes imagen = new Imagenes(
                    rs.getString("cod_imagenes"),
                    rs.getInt("cod_titulos"),
                    rs.getString("imagenes")
                );

                imagenes.add(imagen);
            }

            stmt.close();
            rs.close();
        } catch (Exception e) {
            
        }
        return imagenes;
    }

    
}
