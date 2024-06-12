package conversor;
import java.util.Scanner;

public class Monedas {
    public static String[] opciones8 = {
            "Quetzales a Dolares", "Dolares a Quetzales",
            "Quetzales a Pesos Mexicanos", "Pesos Mexicanos a Quetzales"
    };

    public static double conversiones1(double quetzales) {

        double Quetzales_a_Dolares = quetzales * 0.13 ;
        return Quetzales_a_Dolares;
    }

    public static double conversiones2(double dolares) {

        double Dolares_a_Quetzales = dolares * 7.76 ;
        return Dolares_a_Quetzales;
    }

    public static double conversiones3(double quetzales) {

        double Quetzales_a_Pesos_Mexicanos = quetzales * 2.39 ;
        return Quetzales_a_Pesos_Mexicanos;
    }

    public static double conversiones4(double pesos) {

        double Pesos_Mexicanos_a_Quetzales = pesos * 0.42 ;
        return Pesos_Mexicanos_a_Quetzales;
    }

    public static void programa() {

        System.out.println("");
        for (int i = 0; i < opciones8.length; i++) {

            System.out.printf("[%d] %s", i + 1, opciones8[i]);

            for (int j = 0; j < (29 - opciones8[i].length()); j++) {
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0) {
                System.out.println("");

            }
        }
        Scanner opcion = new Scanner(System.in);
        System.out.print("[?]:");
        int r = opcion.nextInt();

        switch (r){
            case 1:
                conversor1();
                break;
            case 2:
                conversor2();
                break;
            case 3:
                conversor3();
                break;
            case 4:
                conversor4();
                break;
        }
    }

    public static void conversor1(){
        Scanner conversor1 = new Scanner(System.in);
        System.out.print("Ingresa una cantidad en Q :");
        int r1 = conversor1.nextInt();

        double resultado1 = conversiones1(r1);
        System.out.println("Cantidad en dolares :" + resultado1);

    }

    public static void conversor2(){
        Scanner conversor1 = new Scanner(System.in);
        System.out.print("Ingresa una cantidad en $ :");
        int r1 = conversor1.nextInt();

        double resultado1 = conversiones2(r1);
        System.out.println("Cantidad en quetzales :" + resultado1);

    }

    public static void conversor3(){
        Scanner conversor1 = new Scanner(System.in);
        System.out.print("Ingresa una cantidad en Q :");
        int r1 = conversor1.nextInt();

        double resultado1 = conversiones3(r1);
        System.out.println("Cantidad en Pesos :" + resultado1);

    }

    public static void conversor4(){
        Scanner conversor1 = new Scanner(System.in);
        System.out.print("Ingresa una cantidad en Pesos :");
        int r1 = conversor1.nextInt();

        double resultado1 = conversiones4(r1);
        System.out.println("Cantidad en Quetzales :" + resultado1);

    }
}
