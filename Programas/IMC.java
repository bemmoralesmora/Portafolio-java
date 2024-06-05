package Programas;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class IMC {
    public static double calcularIMC(double peso, double altura) {

        double IMC = peso / (altura * altura);
        return IMC;
    }

    public static void programaIMC(){

        Scanner intoDato = new Scanner(System.in);
        System.out.print("Peso :");
        double peso = intoDato.nextDouble();
        System.out.print("Altura :");
        double altura = intoDato.nextDouble();

        //PROCESO
        double IMC = calcularIMC(peso, altura);

        //RESULTADO
        System.out.println(" IMC :" + IMC);

        System.out.println(" --------------------");
        if (IMC < 18.5) {
            System.out.println("IMC Bajo ");
        } else if (IMC > 18.5 && IMC < 24.5) {
            System.out.println(" --> IMC normal");

        } else if (IMC > 25 && IMC < 29.9) {
            System.out.println(" --> IMC sobre peso");

        } else if (IMC > 30 && IMC < 34.9) {
            System.out.println(" --> IMC obecidad I");

        } else if (IMC > 35 && IMC < 39.9) {
            System.out.println(" --> IMC obcidad II");

        } else if (IMC > 40 && IMC < 49.9) {
            System.out.println(" --> obecidad III");

        } else if (IMC > 50) {
            System.out.println(" --> obecidad IV");
        }

    }
}
