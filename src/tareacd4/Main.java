package tareacd4;

import banco.CtaCorriente;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        operativa_cuenta();
    }

    public static void operativa_cuenta() {
        CtaCorriente miCuenta;
        double saldoActual;

        miCuenta = new CtaCorriente("Koldo García Ábalos","0001-2345-07-1234567890",5000,0);
        saldoActual = miCuenta.getSaldocuenta();
        System.out.println("El saldo inicial es de "+ saldoActual +" euros");

        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea retirar?");
            double importe = entrada.nextDouble();
            miCuenta.retirar(importe);
            System.out.println("El saldo actual de su cuenta es "+miCuenta.getSaldocuenta()+" euros");
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea ingresar en su cuenta?");
            double importe = entrada.nextDouble();
            miCuenta.ingresar(importe);
            System.out.println("El saldo actual de su cuenta es "+miCuenta.getSaldocuenta()+" euros");
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}