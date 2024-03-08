package tareacd4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CC miCuenta;
        double saldoActual;

        miCuenta = new CC("Koldo García Ábalos","0001-2345-07-1234567890",5000,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo inicial es de "+ saldoActual +" euros");

        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea retirar?");
            double importe = entrada.nextDouble();
            miCuenta.retirar(importe);
            System.out.println("El saldo actual de su cuenta es "+miCuenta.estado()+" euros");
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea ingresar en su cuenta?");
            double importe = entrada.nextDouble();
            miCuenta.ingresar(importe);
            System.out.println("El saldo actual de su cuenta es "+miCuenta.estado()+" euros");
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}