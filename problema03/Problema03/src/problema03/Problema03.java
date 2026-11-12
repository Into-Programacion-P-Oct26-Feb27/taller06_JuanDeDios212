/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int tipo;
        int ano;
        String nombre;
        double sueldoInicial;
        double bonificacion;
        double nuevoSueldo;
        double incremento;
        double porcentajeIncremento;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su sueldo actual");
        sueldoInicial = entrada.nextDouble();

        System.out.printf("Ingrese los años de servicio.\n");
        ano = entrada.nextInt();

        System.out.printf("Ingrese el tipo de empelado que es.\n"
                + "1 \n"
                + "2 \n"
                + "3 \n"
                + "4 \n"
                + "5 o cualquier otro\n");
        tipo = entrada.nextInt();

        switch (tipo) {
            case 1:
                incremento = 5;
                break;
            case 2:
                incremento = 7;
                break;
            case 3:
                incremento = 9;
                break;
            case 4:
                incremento = 12;
                break;
            default:
                incremento = 15;
                break;
        }
        if (ano >= 100) {
            bonificacion = 100;
        } else {
            if (ano >= 5) {
                bonificacion = 60;
            } else {
                if (ano >= 2) {
                    bonificacion = 30;
                } else {
                    bonificacion = 0;
                }
            }
        }
        
        porcentajeIncremento = (sueldoInicial * incremento) / 100;
        nuevoSueldo = sueldoInicial + bonificacion + porcentajeIncremento;
       
                
        System.out.printf("Ingrese la operacion que requiera hacer.\n"
                + "Empelado: %s\n"
                + "Tipo de empelado: %s\n"
                + "Años de servivio: %s\n\n"
                + "Sueldo inicial: $%.2f\n"
                + "Porcentaje de incremento; %.2f %%\n"
                + "Incremento salarial: $%.2f\n"
                + "Bonificacion por antigüedad: $%.2f\n\n"
                + "Nuevo sueldo: $%.2f\n",
                nombre, tipo, ano, sueldoInicial, incremento, 
                porcentajeIncremento, bonificacion, nuevoSueldo);
               
        

    }

}
