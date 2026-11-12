/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema012;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opcion;
        double resultado = 0;
        String operacion = "Ninguno";

        System.out.printf("Ingrese la operacion que requiera hacer.\n"
                + "1 Suma\n"
                + "2 Resta\n"
                + "3 Multiplicación \n"
                + "4 Division\n"
                + "5 Módulo\n"
                + "6 Potencia\n");
        opcion = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese el primer dígito");
        double primero = entrada.nextDouble();
        System.out.println("Ingrese el segudno dígito");
        double segundo = entrada.nextDouble();

        if ((opcion == 4 || opcion == 5) && segundo == 0) {
            System.out.println("No se pue de realizar la opereción");
        } else {
            if (primero >= segundo) {
                if (opcion == 1) {
                    resultado = primero + segundo;
                    operacion = "Suma";
                } else {
                    if (opcion == 2) {
                        resultado = primero - segundo;
                        operacion = "Resta";
                    } else {
                        if (opcion == 3) {
                            resultado = primero * segundo;
                            operacion = "Multiplicación";
                        } else {
                            if (opcion == 4) {
                                resultado = primero / segundo;
                                operacion = "División";
                            } else {
                                if (opcion == 5) {
                                    resultado = primero % segundo;
                                    operacion = "Módulo";
                                } else {
                                    if (opcion == 6) {
                                        resultado = Math.pow(primero, segundo);
                                        operacion = "Potencia";
                                    } else {
                                        System.out.println("No es una opcion valida");

                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("No se puede realizar la operación");
            }
            System.out.printf("OPERACIONES MATEMÁTICAS\n\n"
                    + "Primer número: %.2f\n"
                    + "Segundo número: %.2f\n"
                    + "Operación seleccionada: %s\n\n"
                    + "El resultado de la operación es %.2f\n",
                    primero, segundo, operacion, resultado);
        }
    }
}
