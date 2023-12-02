package parcial3.backend.Entities;

public class Texto {
    private String Cod_texto;
    private int Cod_titulos;
    private String Texto;
     
    public Texto(){
    }

    public Texto(String cod_texto, int cod_titulos, String texto){
        Cod_texto = cod_texto;
        Cod_titulos = cod_titulos;
        Texto = texto;
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

    public int getCod_titulos() {
        return Cod_titulos;
    }

    public void setCod_titulos(int cod_titulos) {
        Cod_titulos = cod_titulos;
    }
}
