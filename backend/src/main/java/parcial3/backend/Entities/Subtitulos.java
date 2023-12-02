package parcial3.backend.Entities;

public class Subtitulos {
    private String Cod_subtitulos;
    private int Cod_titulos;
    private String Subtitulos;

    public Subtitulos(){
    }

    public Subtitulos(String cod_subtitulos, int cod_titulos, String subtitulos){
        Cod_subtitulos = cod_subtitulos;
        Cod_titulos = cod_titulos;
        Subtitulos = subtitulos;
    }

    public String getCod_subtitulos() {
        return Cod_subtitulos;
    }

    public void setCod_subtitulos(String cod_subtitulos) {
        Cod_subtitulos = cod_subtitulos;
    }

    public String getSubtitulos() {
        return Subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        Subtitulos = subtitulos;
    }

    public int getCod_titulos() {
        return Cod_titulos;
    }

    public void setCod_titulos(int cod_titulos) {
        Cod_titulos = cod_titulos;
    }
}
