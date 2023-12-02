package parcial3.backend.Entities;

public class Titulos {
    private int Cod_titulos;
    private String Titulos;

    public Titulos(){
    }

    public Titulos(int cod_titulos, String titulos){
        Cod_titulos = cod_titulos;
        Titulos = titulos;
    }

    public String getTitulos() {
        return Titulos;
    }

    public void setTitulos(String titulos) {
        Titulos = titulos;
    }

    public int getCod_titulos() {
        return Cod_titulos;
    }

    public void setCod_titulos(int cod_titulos) {
        Cod_titulos = cod_titulos;
    }
}
