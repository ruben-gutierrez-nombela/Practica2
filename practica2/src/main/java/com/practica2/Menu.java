package com.practica2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
    
    private static boolean finalizar = false;

    private static final String OPCION_1_MENU = "1. Visualizar obras en la galería";
    private static final String OPCION_2_MENU = "2. Dar de alta una obra";
    private static final String OPCION_3_MENU = "3. Modificar datos de una obra";
    private static final String OPCION_4_MENU = "4. Visualizar datos de una obra";
    private static final String OPCION_5_MENU = "5. Obtener precio de venta de una obra";
    private static final String OPCION_6_MENU = "6. Imprimir etiqueta de una obra";
    private static final String OPCION_SALIR_MENU = "0. SALIR";
    private static final String[] OPCIONES_MENU = {OPCION_1_MENU, OPCION_2_MENU, OPCION_3_MENU, OPCION_4_MENU, OPCION_5_MENU, OPCION_6_MENU, OPCION_SALIR_MENU};

    private static final int DECIR_1 = 1;
    private static final int DECIR_2 = 2;
    private static final int DECIR_3 = 3;
    private static final int DECIR_4 = 4;
    private static final int DECIR_5 = 5;
    private static final int DECIR_6 = 6;
    private static final int SALIR = 0;
    private static final String MENSAJE_ERROR_USER = "Opción elegida incorrecta";
    private static final String MENSAJE_DESPEDIDA = "¡Gracias por usar la aplicación! Hasta pronto.";


    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        while (!finalizar) {
            for (final String OPCION_MENU : OPCIONES_MENU){
                System.out.println(OPCION_MENU);
            }

            int userInput = 0;
            try {
                userInput = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println(MENSAJE_ERROR_USER);
                sc.next();
                continue;
            }

            switch (userInput) {
                case DECIR_1:
                    System.out.println("");
                    break;
                case DECIR_2:
                    System.out.println("");
                    break;
                case DECIR_3:
                    System.out.println("");
                    break;
                case DECIR_4:
                    System.out.println("");
                    break;
                case DECIR_5:
                    System.out.println("");
                    break;
                case DECIR_6:
                    System.out.println("");
                    break;
                case SALIR:
                    finalizar = true;
                    break;
                default:
                    System.out.println(MENSAJE_ERROR_USER);
            }
        }

        sc.close();

        System.out.println(MENSAJE_DESPEDIDA);
    }




}
