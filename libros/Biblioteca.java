package libros;
import java.util.Scanner;

public class Biblioteca {

    public static void programa(){
        System.out.println("biblioteca");

        libro libro1 = new libro("Marianela", "Benito Pérez Galdós", "1878");
        libro libro2 = new libro("Otelo", "William Shakespeare", "1603");
        libro libro3 = new libro("El diario de Ana Frank", "Ana Frank", "1947");
        libro libro4 = new libro("Las luces de septiembre", "Carlos Ruiz Zafón", "1995");
        libro libro5 = new libro("Don Juan Tenorio", "José Zorrilla", "1844");
        libro libro6 = new libro("De cómo me fui a todas partes", "María Luisa Puga", "1976");
        libro libro7 = new libro("Pablo Escobar: Mi Padre", "Juan Pablo Escobar", "2014");
        libro libro8 = new libro("La Divina Comedia", "Dante Alighieri", "1320");
        libro libro9 = new libro("La teoría de la relatividad", "Albert Einstein", "1916");
        libro libro10 = new libro("Don Quijote de la Mancha", "Miguel de Cervantes", "1605");


        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println(libro4.toString());
        System.out.println(libro5.toString());
        System.out.println(libro6.toString());
        System.out.println(libro7.toString());
        System.out.println(libro8.toString());
        System.out.println(libro9.toString());
        System.out.println(libro10.toString());


    }

}
