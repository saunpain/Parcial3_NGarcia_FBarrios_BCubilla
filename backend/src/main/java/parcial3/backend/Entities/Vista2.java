package parcial3.backend.Entities;

public class Vista2 {
    private int Cod_titulos;
    private String Titulos;
    private String Cod_imagenes;
    private String Imagenes;
    private String Cod_subtitulo;
    private String Subtitulo;    
    private String Cod_texto;
    private String Texto;

    public Vista2(){

    }

    public Vista2(int cod_titulos, String titulos, String cod_imagenes, String imagenes, String cod_subtitulo, String subtitulo, String cod_texto, String texto  ){
        Cod_titulos = cod_titulos;
        Titulos = titulos;
        Cod_imagenes = cod_imagenes;
        Imagenes = imagenes;
        Cod_subtitulo = cod_subtitulo;
        Subtitulo = subtitulo;
        Cod_texto = cod_texto;
        Texto = texto;
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

    public String getCod_subtitulo() {
        return Cod_subtitulo;
    }

    public void setCod_subtitulo(String cod_subtitulo) {
        Cod_subtitulo = cod_subtitulo;
    }

    public String getSubtitulo() {
        return Subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        Subtitulo = subtitulo;
    }

    public String getCod_texto() {
        return Cod_texto;
    }

    public void setCod_texto(String cod_texto) {
        Cod_texto = cod_texto;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }
    
}
