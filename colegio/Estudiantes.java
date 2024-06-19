package colegio;

public class Estudiantes {
    private String nombre;
    private String correo;
    private String carrera;
    private String edad;
    private String solvencia;

    public Estudiantes(String nombre, String correo, String carrera, String edad, String solvencia){
        this.nombre= nombre;
        this.correo= correo;
        this.carrera= carrera;
        this.edad= edad;
        this.solvencia= solvencia;
    }
    // METODO GET
    public String getNombre(){
        return "nombre: " + nombre ;
    }

    public String getCorreo() {
        return "correo: " + correo;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getEdad() {
        return edad;
    }

    public String getSolvencia(){
        return solvencia;
    }

    // METODO SET


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setSolvencia(String solvencia) {
        this.solvencia = solvencia;
    }

    @Override
    public String toString() {
        return "nombre" + nombre + "correo" + correo + "carrera" + carrera + "edad" + edad + "solvencia" + solvencia;
    }
}

