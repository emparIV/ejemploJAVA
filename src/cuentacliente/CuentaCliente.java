/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacliente;

import java.util.Scanner;

/**
 *
 * @author a053881694p
 */
public class CuentaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cliente cl1 = new Cliente("12345678P", "Empar Ibáñez", "Mi casa");
        Cuenta cu1 = new Cuenta(460654654, "10/01/2017", 100, cl1);

        System.out.println(cu1.toString());

        System.out.print("¿Ingresar(1) o Retirar(2)? ");

        Scanner datos = new Scanner(System.in);
        double inout = datos.nextInt();

        if (inout == 1) {
            System.out.print("Introduzca cantidad a ingresar: ");
            double aux = datos.nextInt();

            cu1.ingresar(aux);

            System.out.println("Su saldo actual es de " + cu1.balance + " €");
        }

        if (inout == 2) {
            System.out.print("Introduzca cantidad a retirar: ");
            double aux = datos.nextInt();

            cu1.retirar(aux);

            System.out.println("Su saldo actual es de " + cu1.balance + " €");
        }

    }

}
