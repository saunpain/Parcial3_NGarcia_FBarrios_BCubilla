package parcial3.backend.Services;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import parcial3.backend.Entities.nav;
import parcial3.backend.Entities.Vista10;
import parcial3.backend.Entities.Vista2;
import parcial3.backend.Entities.Vista3;
import parcial3.backend.Entities.Vista4;
import parcial3.backend.Entities.Vista5;
import parcial3.backend.Entities.Vista6;
import parcial3.backend.Entities.Vista7;
import parcial3.backend.Entities.Vista8;
import parcial3.backend.Entities.Vista9;
import parcial3.backend.Helpers.Conexion;

public class VistasDb {
    
    private Connection cn;

    public VistasDb(){
        this.cn = new Conexion().openDb();
    }

    public List<nav> ObtenerVistaNav(){
        List<nav> navList = new ArrayList<>();

        try{
            Statement stmt = cn.createStatement();
            String query = "Select * FROM nav";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                nav navObj = new nav(
                    rs.getInt("cod_titulos"),
                    rs.getString("titulos"),
                    rs.getString("cod_imagenes"),
                    rs.getString("imagenes")
                );

                navList.add(navObj);
            }
        } catch(Exception e){

        }
        return navList;
    }

    public List<Vista2> ObtenerVista2(){//cambiar
        List<Vista2> vista2List = new ArrayList<>();//cambiar List y nombre de la list
        try{
            Statement  smt = cn.createStatement();
            String query = "Select * From Part2";
            ResultSet rs = smt.executeQuery(query);
            while(rs.next()) {
                Vista2 Vista2Obj = new Vista2(//cambiar
                    rs.getInt("Codigo del titulo"),
                    rs.getString("Titulo"),
                    rs.getString("codigo imagenes"),
                    rs.getString("Imagenes"),
                    rs.getString("COD_subtitulo"),
                    rs.getString("subtitulos"),
                    rs.getString("Codigo del texto"),
                    rs.getString("texto")
                );
                vista2List.add(Vista2Obj);//cambiar
            }
        }catch(Exception e){
        }
        return vista2List;//cambiar
    }

    public List<Vista3> ObtenerVista3(){//cambiar
        List<Vista3> vista3List = new ArrayList<>();//cambiar List y nombre de la list
        try{
            Statement  smt = cn.createStatement();
            String query = "Select * From Part3";
            ResultSet rs = smt.executeQuery(query);
            while(rs.next()) {
                Vista3 Vista3Obj = new Vista3(
                    rs.getInt("Codigo del titulo"),
                    rs.getString("Titulo"),
                    rs.getString("codigo imagenes"),
                    rs.getString("Imagenes"),
                    rs.getString("Codigo del texto"),
                    rs.getString("texto")
                );
                vista3List.add(Vista3Obj);//cambiar
            }
        }catch(Exception e){
        }
        return vista3List;//cambiar
    }
    

    public List<Vista4> ObtenerVista4(){
        List<Vista4> vista4List = new ArrayList<>();
        try{
            Statement  smt = cn.createStatement();
            String query = "Select * From Part4";
            ResultSet rs = smt.executeQuery(query);
            while(rs.next()) {
                Vista4 Vista4Obj = new Vista4(
                    rs.getInt("Codigo del titulo"),
                    rs.getString("Titulo"),
                    rs.getString("Codigo del texto"),
                    rs.getString("texto"),
                    rs.getString("codigo imagenes"),
                    rs.getString("Imagenes")
                );
                vista4List.add(Vista4Obj);
            }
        }catch(Exception e){
        }
        return vista4List;
    }
        
        
        public List<Vista5> ObtenerVista5(){
        List<Vista5> Vista5List = new ArrayList<>();
        try{
            Statement stmt = cn.createStatement();
            String query = "Select * FROM Part5";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                Vista5 vista5Obj = new Vista5(
                    rs.getInt("Codigo del titulo"),
                    rs.getString("titulos"),
                    rs.getString("COD_subtitulo"),
                    rs.getString("subtitulo"),
                    rs.getString("codigo imagenes"),
                    rs.getString("Imagenes"),
                    rs.getString("Codigo del texto"),
                    rs.getString("texto")
                );

                Vista5List.add(vista5Obj);
            }
        } catch(Exception e){

        }
        return Vista5List;
    }

            public List<Vista6> ObtenerVista6(){
        List<Vista6> Vista6List = new ArrayList<>();
        try{
            Statement stmt = cn.createStatement();
            String query = "Select * FROM Part6";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                Vista6 vista6Obj = new Vista6(
                    rs.getInt("Codigo del titulo"),
                    rs.getString("titulos"),
                    rs.getString("COD_subtitulo"),
                    rs.getString("subtitulo"),
                    rs.getString("codigo imagenes"),
                    rs.getString("Imagenes"),
                    rs.getString("Codigo del texto"),
                    rs.getString("texto")
                );

                Vista6List.add(vista6Obj);
            }
        } catch(Exception e){

        }
        return Vista6List;
    }

    //parte de brian---------------------------------------------------------------------

    public List<Vista7> ObtenerVista7(){
        List<Vista7> Vista7List = new ArrayList<>();
        try{
            Statement stmt = cn.createStatement();
            String query = "Select * FROM Part7";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                Vista7 vista7Obj = new Vista7(
                    rs.getInt("Codigo del titulo"),
                    rs.getString("titulos"),
                    rs.getString("COD_subtitulo"),
                    rs.getString("subtitulo"),
                    rs.getString("codigo imagenes"),
                    rs.getString("Imagenes"),
                    rs.getString("Codigo del texto"),
                    rs.getString("texto")
                );

                Vista7List.add(vista7Obj);
            }
        } catch(Exception e){

        }
        return Vista7List;
    }
    
        public List<Vista8> ObtenerVista8(){
        List<Vista8> Vista8List = new ArrayList<>();

        try{
            Statement stmt = cn.createStatement();
            String query = "Select * FROM Part8";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                Vista8 vista8Obj = new Vista8(
                    rs.getInt("Codigo del titulo"),
                    rs.getString("titulos"),
                    rs.getString("codigo imagenes"),
                    rs.getString("Imagenes")
                );

                Vista8List.add(vista8Obj);
            }
        } catch(Exception e){

        }
        return Vista8List;
    }

    public List<Vista9> ObtenerVista9(){
        List<Vista9> Vista9List = new ArrayList<>();

        try{
            Statement stmt = cn.createStatement();
            String query = "Select * FROM footerImagenes";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                Vista9 vista9Obj = new Vista9(
                    rs.getInt("Codigo del titulo"),
                    rs.getString("titulos"),
                    rs.getString("codigo imagenes"),
                    rs.getString("Imagenes")
                );

                Vista9List.add(vista9Obj);
            }
        } catch(Exception e){

        }
        return Vista9List;
    }    

    public List<Vista10> ObtenerVista10(){
        List<Vista10> Vista10List = new ArrayList<>();

        try{
            Statement stmt = cn.createStatement();
            String query = "Select * FROM footerTexto";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                Vista10 vista10Obj = new Vista10(
                    rs.getInt("cod_titulos"),
                    rs.getString("titulos"),
                    rs.getString("Codigo del texto"),
                    rs.getString("texto")
                );

                Vista10List.add(vista10Obj);
            }
        } catch(Exception e){

        }
        return Vista10List;
    }     
}
