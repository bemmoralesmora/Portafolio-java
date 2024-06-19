package colegio;

public class Escuela {
    public static void programa(){
        System.out.println("Estudiantes");

        //Estudiantes
        Estudiantes alumno1 = new Estudiantes("Anuel", "anuel@scl", "Primero Primaria", "7", "true");
        Estudiantes alumno2 = new Estudiantes("Luisa", "luisa@scl", "Primero Primaria", "6", "true");
        Estudiantes alumno3 = new Estudiantes("María", "maria@scl", "Primero Primaria", "7", "true");
        Estudiantes alumno4 = new Estudiantes("Carlo", "carlo@scl", "Primero Primaria", "6", "true");
        Estudiantes alumno5 = new Estudiantes("Sofía", "sofia@scl", "Primero Primaria", "7", "true");

        System.out.println(alumno1.getNombre()+" "+alumno1.getCorreo());
        System.out.println(alumno2.getNombre()+" "+alumno2.getCorreo());
        System.out.println(alumno3.getNombre()+" "+alumno3.getCorreo());
        System.out.println(alumno4.getNombre()+" "+alumno4.getCorreo());
        System.out.println(alumno5.getNombre()+" "+alumno5.getCorreo());

        //Cursos
        System.out.println(" ");
        System.out.println("Cursos");

        Cursos curso1 = new Cursos("Matemáticas", "Matemáticas Básicas", "Lunes y Miércoles 10:00-11:00");
        Cursos curso2 = new Cursos("Lenguaje", "Lenguaje y Comunicación", "Martes y Jueves 9:00-10:00");
        Cursos curso3 = new Cursos("Ciencias", "Ciencias Naturales", "Lunes y Miércoles 11:00-12:00");
        Cursos curso4 = new Cursos("Historia", "Historia General", "Martes y Jueves 10:00-11:00");

        System.out.println(curso1.getNombreC());
        System.out.println(curso2.getNombreC());
        System.out.println(curso3.getNombreC());
        System.out.println(curso4.getNombreC());

    }
}
