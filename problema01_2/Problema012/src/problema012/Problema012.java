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

        System.out.println("Ingrese la operacion que requiera hacer.\n"
                + "1 Suma\n"
                + "2 Resta\n"
                + "3 Multiplicación \n"
                + "4 Division\n"
                + "5 Módulo\n"
                + "6 Potencia");
        opcion = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese el primer dígito");
        double primero = entrada.nextDouble();
        System.out.println("Ingrese el segudno dígito");
        double segundo = entrada.nextDouble();

        if (opcion == 1) {
            resultado = primero + segundo;
        } else {
            if (opcion == 2) {
                resultado = primero - segundo;
            } else {
                if (opcion == 3) {
                    resultado = primero * segundo;
                } else {
                    if (opcion == 4) {
                        resultado = primero / segundo;
                    } else {
                        if (opcion == 5) {
                            resultado = primero % segundo;
                        } else {
                            if (opcion == 6) {
                                resultado = Math.pow(primero, segundo);
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("El resultado de la operación es %.2f\n", resultado);
    }
}
