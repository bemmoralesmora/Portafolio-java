package calculadora;

import java.util.Scanner;

public class AritmeticaBasica {
    public static void cargarOperaciones(){

        // lista de operaciones disponibles.

        String [] listaOpciones ={
            "suma", "resta", "multiplicación", "división",
        };

        // Variable para contar las columnas impresas.

        int columnas = 0;
        System.out.println("");
        for (int i = 0; i< listaOpciones.length; i++){

            System.out.printf("[%d] %s", i + 1, listaOpciones[i]);

            for (int j = 0; j < (14 - listaOpciones[i].length()); j++){
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0){
                System.out.println("");

            }
        }

        // Leer la opción seleccionada por el usuario.

        Scanner intOpcion2 = new Scanner(System.in);
        System.out.print("[?]:");
        int opcion2 = intOpcion2.nextInt();
        System.out.println("--------------------------------------------------");

        // Ejecutar la operación correspondiente según la opción seleccionada.

        switch (opcion2){
            case 1:
                AritmeticaBasica.operacion();
                break;
            case 2:
                AritmeticaBasica.operacion2();
                break;
            case 3:
                AritmeticaBasica.operacion3();
                break;
            case 4 :
                AritmeticaBasica.operacion4();
                break;
        }

    }

    // Método para realizar la suma de dos números.

    public static void operacion(){

        Scanner ecuaciones = new Scanner(System.in);
        System.out.print("num1 :");
        int num1 = ecuaciones.nextInt();
        System.out.print("num2 :");
        int num2 = ecuaciones.nextInt();

        int suma = num1 + num2;
        System.out.println("suma :" + suma);
    }

    // Método para realizar la resta de dos números.

    public static void operacion2(){
        Scanner ecuaciones = new Scanner(System.in);
        System.out.print("num1 :");
        int num1 = ecuaciones.nextInt();
        System.out.print("num2 :");
        int num2 = ecuaciones.nextInt();

        int resta = num1 - num2;
        System.out.println("resta:" + resta);
    }

    // Método para realizar la multiplicación de dos números.

    public static void operacion3(){
        Scanner ecuaciones = new Scanner(System.in);
        System.out.print("num1 :");
        int num1 = ecuaciones.nextInt();
        System.out.print("num2 :");
        int num2 = ecuaciones.nextInt();

        int multiplicacion = num1 * num2;
        System.out.println("multiplicacion:" + multiplicacion);
    }

    // Método para realizar la división de dos números.

    public static void operacion4(){
        Scanner ecuaciones = new Scanner(System.in);
        System.out.print("num1 :");
        int num1 = ecuaciones.nextInt();
        System.out.print("num2 :");
        int num2 = ecuaciones.nextInt();

        int division = num1 + num2;
        System.out.println("division :" + division);
    }
}
