package parcial3.backend.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import parcial3.backend.Entities.Subtitulos;
import parcial3.backend.Helpers.Conexion;

public class SubtitulosDb {
    
    private Connection cn;

    public SubtitulosDb(){
        this.cn = new Conexion().openDb();
    }

    public List<Subtitulos> ObtenerTodosLosSubtitulos(){
        List<Subtitulos> subtitulos = new ArrayList<>();

        try{
            Statement stmt = cn.createStatement();
            String query = "SELECT * FROM Subtitulos";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                Subtitulos subtitulo = new Subtitulos(
                    rs.getString("cod_subtitulos"),
                    rs.getInt("cod_titulos"),
                    rs.getString("subtitulos")
                );

                subtitulos.add(subtitulo);
            }

            stmt.close();
            rs.close();
        } catch(Exception e){

        }
        return subtitulos;
    }
}
