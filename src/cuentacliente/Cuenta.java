/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacliente;

/**
 *
 * @author Empar Ibáñez
 */
public class Cuenta {
    String fechaApertura;
    double balance, aux;
    int cuenta;
    Cliente titular;
    String separador = "****************************************";

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getAux() {
        return aux;
    }

    public void setAux(double aux) {
        this.aux = aux;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public Cuenta(int cuenta, String fechaApertura, double balance, Cliente titular) {
        this.cuenta = cuenta;
        this.fechaApertura = fechaApertura;
        this.balance = balance;
        this.titular = titular;
    }
    
    public void ingresar(double aux) {
        balance = balance + aux;
    }
    
    public void retirar(double aux) {
        if (aux > balance) {
            System.out.println("No es posible retirar esa cantidad, dispone de: " + balance + "€");
        } else {
            balance = balance - aux;
        }
    }

    @Override
    public String toString() {
        return separador + "\n" + titular + "\nCuenta: " + cuenta + "\nBalance: " + balance + "€\n" + separador;
    }
    
    
    
}
