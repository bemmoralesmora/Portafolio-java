package lista;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ListaDeCompras {

    //LISTA DE OPCIONES
    public static String[] opciones6 = { "Lista de opciones", "Salir"};

    //PROGRAMA INICIAL
    public static void programa(){

        System.out.println("");
        for (int i = 0; i< opciones6.length; i++){

            System.out.printf("[%d] %s", i + 1, opciones6[i]);

            for (int j = 0; j < (20 - opciones6[i].length()); j++){
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0){
                System.out.println("");

            }
        }
        Scanner opcion = new Scanner(System.in);
        System.out.print("[?]:");
        int r = opcion.nextInt();

        switch (r){
            case 1 :
                crearLista();
                break;
            case 2 :
                System.out.println("salir");
                break;
        }
    }

    //CREAR LISTA DE COMPRAS
    public static void crearLista(){
        List<String> listaNombre = new ArrayList<>();
        List<Double> listaPrecio = new ArrayList<>();

        String rP;
        double rPc;

        for (int i = 1; i <= 3 ; i++){
            Scanner item = new Scanner(System.in);
            System.out.print("Producto :");
            rP = item.nextLine();
            System.out.print("Precio :");
            rPc = item.nextDouble();

            listaNombre.add(rP);
            listaPrecio.add(rPc);
        }
        System.out.println(listaNombre + "-->" + listaPrecio);
    }


}