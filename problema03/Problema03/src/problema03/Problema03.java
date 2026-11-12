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

        String tipoEmpleado;
        int tipo;
        String anosServicio;
        int ano;
        String nombre;
        double sueldoInicial;
        double bonificacion;
        double nuevoSueldo;
        
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese  su sueldo actual");
        sueldoInicial = entrada.nextDouble();
        
        System.out.printf("Ingrese los años de servicio.\n"
                + "1 Vehículo liviano particular\n"
                + "2 Vehículo grande particular\n"
                + "3 Taxi \n"
                + "4 Bus urbano\n");
        tipo = entrada.nextInt();
        System.out.printf("Ingrese su tipo de coche.\n"
                + "1 \n"
                + "2 \n"
                + "3 \n"
                + "4 \n");
        ano = entrada.nextInt();
    }
}
