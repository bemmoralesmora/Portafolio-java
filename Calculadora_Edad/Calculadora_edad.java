package Calculadora_Edad;

import java.util.Scanner;

public class Calculadora_edad {
    public static int CalculaEdad(int a_nacimiento, int a_actual, int mes_n, int mes_a, int dia_n, int dia_a) {
        int Edad = a_actual - a_nacimiento;

        // Esto dice que si todavia no ha cumplido años al año actual se le resta uno

        if (mes_a < mes_n || (mes_a == mes_n && dia_a < dia_n)){
            Edad--;
        }
        return Edad;
    }

    public static void ProgramaEdad(){
        Scanner datos = new Scanner(System.in);
        System.out.print("Ingresa tu año de nacimiento :");
        int nacimiento = datos.nextInt();

        System.out.print("Ingresa el mes de nacimiento :");
        int mes_n = datos.nextInt();

        System.out.print("Ingresa el dia de nacimiento :");
        int dia_n= datos.nextInt();

        System.out.print("Ingresa la año actual :");
        int actual = datos.nextInt();

        System.out.print("Ingresa el mes actual :");
        int mes_a = datos.nextInt();

        System.out.print("Ingresa el dia actual :");
        int dia_a = datos.nextInt();

        //Calculamos la edad usando los datos ingresados en CalcularEdad
        int Edad = CalculaEdad(nacimiento,actual,mes_n, mes_a, dia_n,dia_a);

        System.out.println("Edad :" + Edad);


    }
}