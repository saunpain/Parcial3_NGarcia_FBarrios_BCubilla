package parcial3.backend.Entities;

public class Vista9 {
    private int Cod_titulos;
    private String Titulos;

    private String Cod_imagenes;
    private String Imagenes;

    public Vista9(){

    }

    public Vista9(int cod_titulos, String titulos, String cod_imagenes, String imagenes){
        Cod_titulos = cod_titulos;
        Titulos = titulos;
        Cod_imagenes = cod_imagenes;
        Imagenes = imagenes;
    }

    public int getCod_titulos() {
        return Cod_titulos;
    }

    public void setCod_titulos(int cod_titulos) {
        Cod_titulos = cod_titulos;
    }

    public String getTitulos() {
        return Titulos;
    }

    public void setTitulos(String titulos) {
        Titulos = titulos;
    }

    public String getCod_imagenes() {
        return Cod_imagenes;
    }

    public void setCod_imagenes(String cod_imagenes) {
        Cod_imagenes = cod_imagenes;
    }

    public String getImagenes() {
        return Imagenes;
    }

    public void setImagenes(String imagenes) {
        Imagenes = imagenes;
    }
}