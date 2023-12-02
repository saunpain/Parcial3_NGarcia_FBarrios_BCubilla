package parcial3.backend.Entities;

public class Imagenes {
    private String Cod_imagenes;
    private int Cod_titulos;
    private String Imagenes;

    public Imagenes(){
    }

    public Imagenes(String cod_imagenes, int cod_titulos, String imagenes){
        Cod_imagenes = cod_imagenes;
        Cod_titulos = cod_titulos;
        Imagenes = imagenes;
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

    public int getCod_titulos() {
        return Cod_titulos;
    }

    public void setCod_titulos(int cod_titulos) {
        Cod_titulos = cod_titulos;
    }
}
