package mis_metodos;

public class ListaOpciones {
    public static void cargarOpciones(){
        String [] listaOpciones = {
                "Calculadora", "IMC",
                "ConversorGrados", "Conversor de longitudes",
                "Calculadora de edad", "Lista De Compras",
                "Conversor Moneda", "Biblioteca",
                "Opcion_9", "Salir",
        };
        int columnas = 0;

        System.out.println("");
        for (int i = 0; i< listaOpciones.length; i++){

            System.out.printf("[%d] %s", i + 1, listaOpciones[i]);

            for (int j = 0; j < (20 - listaOpciones[i].length()); j++){
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0){
                System.out.println("");

            }
        }
    }
}
