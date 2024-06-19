package colegio;

public class Cursos {
    private String nombreC;
    private String categoria;
    private String periodo;

    public Cursos(String nombreC, String categoria, String periodo){
        this.nombreC = nombreC;
        this.categoria= categoria;
        this.periodo=periodo;
    }

    public String getNombreC() {
        return "Nombre:" +nombreC ;
    }

    public String getCategoria() {
        return "Categoria:" + categoria ;
    }

    public String getPeriodo() {
        return "Periodo:"+ periodo;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "nombre:" + nombreC + "categoria" + categoria + "periodo" + periodo;
    }
}
