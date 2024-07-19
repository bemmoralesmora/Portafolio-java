import conversor.Longitudes;
import interfaz_grafica.Banner;
import mis_metodos.ListaOpciones;
import IMC.IMC;
import calculadora.AritmeticaBasica;
import conversor.ConversorGrados;
import calculadora.Calculadora_edad;
import lista.ListaDeCompras;

import java.awt.*;
import java.util.Scanner;
import conversor.Monedas;
import mis_metodos.MisMetodos;
import libros.Biblioteca;
import libros.libro;
import colegio.Escuela;

import javax.swing.*;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {

        MisMetodos.LimpiarConsola();
        Banner.mensaje_1();

        // SECCION GRAFICA

        //VENTANA
        JFrame miVentana = new JFrame();
        miVentana.setBounds(0, 0, 500, 600);
        miVentana.setVisible(true);
        miVentana.setTitle("bemorales");

        miVentana.setLayout(null);

        // PANEL DEL BANNER

        JPanel banner = new JPanel();
        JLabel titulo = new JLabel("ROCKEMMA");
        titulo.setBounds(200, 20, 500, 60);
        miVentana.add(titulo);
        titulo.setVisible(true);
        titulo.setSize(100, 100);

        // OPCIONES

        JLabel numero1 = new JLabel("[1]_______");
        numero1.setBounds(50, 100, 150, 30 );
        miVentana.add(numero1);

        JLabel numero2 = new JLabel("[2]_______");
        numero2.setBounds(300, 100, 150, 30 );
        miVentana.add(numero2);

        JLabel numero3 = new JLabel("[3]_______");
        numero3.setBounds(50, 200, 150, 30 );
        miVentana.add(numero3);

        JLabel numero4 = new JLabel("[4]_______");
        numero4.setBounds(300, 200, 150, 30 );
        miVentana.add(numero4);

        JLabel numero5 = new JLabel("[5]_______");
        numero5.setBounds(50, 300, 150, 30 );
        miVentana.add(numero5);

        JLabel numero6 = new JLabel("[6]_______");
        numero6.setBounds(300, 300, 150, 30 );
        miVentana.add(numero6);

        // BOTON

        JButton boton = new JButton("Click");
        boton.setBounds(300, 400, 100, 50);
        boton.setVisible(true);

        miVentana.add(boton);

        boolean programa = true;

        do{

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
                    Biblioteca.programa();
                    break;
                case 9:
                    Escuela.programa();
                    break;
                case 10:
                    programa = false;
                    break;

            }
        }while (programa);


    }
}