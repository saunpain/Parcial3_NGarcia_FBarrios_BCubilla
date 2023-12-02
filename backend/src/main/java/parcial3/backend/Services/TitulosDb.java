package parcial3.backend.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import parcial3.backend.Entities.Titulos;

import parcial3.backend.Helpers.Conexion;

public class TitulosDb {
    
    private Connection cn;

    public TitulosDb(){
        this.cn = new Conexion().openDb();
    }

    public List<Titulos> ObtenerTodosLosTitulos(){
        List<Titulos> titulos = new ArrayList<>();

        try {
            Statement stmt = cn.createStatement();
            String query = "SELECT * FROM Titulos";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                Titulos titulo = new Titulos(
                    rs.getInt("cod_titulos"),
                    rs.getString("titulos")
                );

                titulos.add(titulo);
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {

        }
        return titulos;
    }
}
