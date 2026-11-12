/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int tipo;
        double avaluo = 0;
        double valorFijo = 0;
        double porcentajeAvaluo = 0;
        double recargo = 0;
        String carro;
        double valorBase;
        double valorFinal;
        
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el avaluo");
        avaluo = entrada.nextDouble();

        System.out.printf("Ingrese su tipo de coche.\n"
                + "1 Vehículo liviano particular\n"
                + "2 Vehículo grande particular\n"
                + "3 Taxi \n"
                + "4 Bus urbano\n");
        tipo = entrada.nextInt();

        switch(tipo) {
            case 1:
                porcentajeAvaluo = 0.01;
                valorFijo = 2;
                carro = "Vehículo liviano particular";
                break;
            case 2:
                porcentajeAvaluo = 0.02;
                valorFijo = 2.50;
                carro = "Vehículo grande particular";
                break;
            case 3:
                porcentajeAvaluo = 0.04;
                valorFijo = 1.50;
                carro = "Taxi";
                break;
            case 4:
                porcentajeAvaluo = 0.05;
                valorFijo = 2.20;
                carro = "Bus urbano";
                break;
                
        }
        if (avaluo >= 30000){
            recargo = 1.50;
        }
        valorBase = (avaluo * porcentajeAvaluo) + valorFijo;
        valorFinal = valorBase + recargo;
        
         System.out.printf("Peaje Buena Vía\n"
                 + "Propietario: %s\n"
                 + "Tipo: %s\n"
                 + "    Avalúo: %.2f\n"
                 + "    Valor base del peaje; %.2f\n"
                 + "    Recargo: %.2f\n\n"
                 + "    Total a cancelar: %.2f\n",
                 nombre, carro, avaluo, valorBase, recargo, valorFinal);
    }
}
