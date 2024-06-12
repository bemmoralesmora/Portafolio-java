import conversor.Longitudes;
import interfaz_grafica.Banner;
import mis_metodos.ListaOpciones;
import IMC.IMC;
import calculadora.AritmeticaBasica;
import conversor.ConversorGrados;
import calculadora.Calculadora_edad;
import lista.ListaDeCompras;
import java.util.Scanner;
import conversor.Monedas;
import mis_metodos.MisMetodos;


public class Main {
    public static void main(String[] args) {

        boolean programa = true;

        do{
            MisMetodos.LimpiarConsola();
            Banner.mensaje_1();
            ListaOpciones.cargarOpciones();
            MisMetodos.impriirLinea();

            //Pedir una opcion
            Scanner intOpcion = new Scanner(System.in);
            System.out.print("[?]:");
            int opcion = intOpcion.nextInt();
            System.out.println("--------------------------------------------------");

            //CARGAR OPCION DE USUARIO

            switch (opcion){
                case 1:
                    AritmeticaBasica.cargarOperaciones();
                    break;
                case 2:
                    IMC.programaIMC();
                    break;
                case 3:
                    ConversorGrados.grados();
                    break;
                case 4:
                    Longitudes.cargarOperaciones();
                    break;
                case 5:
                    Calculadora_edad.ProgramaEdad();
                    break;
                case 6:
                    ListaDeCompras.programa();
                    break;
                case 7:
                    Monedas.programa();
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