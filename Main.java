import interfaz_grafica.Banner;
import opciones.ListaOpciones;
import Programas.IMC;
import Matemáticas.Mate;
import Farenheit_Celsius.Celsius;
import Calculadora_Edad.Calculadora_edad;
import Lista.ListaDeCompras;
import java.util.Scanner;
import conversor_moneda.moneda;


public class Main {
    public static void main(String[] args) {

        boolean programa = true;

        do{

            Banner.mensaje_1();
            ListaOpciones.cargarOpciones();

            //Pedir una opcion
            Scanner intOpcion = new Scanner(System.in);
            System.out.print("[?]:");
            int opcion = intOpcion.nextInt();
            System.out.println("--------------------------------------------------");

            //CARGAR OPCION DE USUARIO

            switch (opcion){
                case 1:
                    Mate.cargarOperaciones();
                    break;
                case 2:
                    IMC.programaIMC();
                    break;
                case 3:
                    Celsius.grados();
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    break;
                case 5:
                    Calculadora_edad.ProgramaEdad();
                    break;
                case 6:
                    ListaDeCompras.programa();
                    break;
                case 7:
                    moneda.programa();
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Opcion 9");
                    break;
                case 10:
                    programa = false;
                    break;

            }
        }while (programa);


    }
}