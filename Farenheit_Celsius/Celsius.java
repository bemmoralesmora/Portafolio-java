package Farenheit_Celsius;

import java.util.Scanner;

public class Celsius {
    public static void grados(){

        String [] listaOpciones2 ={
                "F/C", "C/F"
        };

        int columnas = 0;
        System.out.println("");
        for (int i = 0; i< listaOpciones2.length; i++){

            System.out.printf("[%d] %s", i + 1, listaOpciones2[i]);

            for (int j = 0; j < (14 - listaOpciones2[i].length()); j++){
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0){
                System.out.println("");

            }
        }

        Scanner intOpcion3 = new Scanner(System.in);
        System.out.print("[?]:");
        int opcion3 = intOpcion3.nextInt();
        System.out.println("--------------------------------------------------");

        switch (opcion3){
            case 1:
                Celsius.progamas();
                break;
            case 2:
                Celsius.progamas2();
                break;
        }

    }

    public static void progamas (){
        Scanner temperaturaC= new Scanner(System.in);
        System.out.print("Temperatura Faranheit:");
        int gradosC = temperaturaC.nextInt();

        int fahrenheit =(gradosC-32)*5/9;

        System.out.println("grados Celsius ="+fahrenheit);
    }

    public static void progamas2 (){
        Scanner temperaturaC= new Scanner(System.in);
        System.out.print("Temperatura Celsius:");
        int gradosf = temperaturaC.nextInt();

        double Celsius =(gradosf*9/5)+32;

        System.out.println("Grados fahrenheit ="+ Celsius);

    }


}
