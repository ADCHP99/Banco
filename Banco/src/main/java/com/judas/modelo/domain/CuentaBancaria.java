
package com.judas.modelo.domain;

import java.util.ArrayList;
import java.util.List;


public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    private String tipoCuenta;
    private Cliente cliente;
    private List<Transaccion> transacciones;
    

    public CuentaBancaria(int numeroCuenta, double saldo, String tipoCuenta, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.cliente=cliente;
        this.transacciones = new ArrayList<>();
        cliente.CrearCuenta(this);
    }
    
    public void depositar(double monto){
        saldo= saldo+monto;
        Transaccion transaccion = new Transaccion("Depositar",monto);
        transacciones.add(transaccion);
    }
    
    public void retirar(double monto){
        if(saldo>=monto){
            saldo=saldo-monto;
            Transaccion transaccion = new Transaccion("Retiro", monto);
            transacciones.add(transaccion);
        }else{
            System.out.println("SALDO INSUFICIENTE!!!!");
        }
    }
    public double verSaldo(){
           return saldo;
    }
    
    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", tipoCuenta=" + tipoCuenta + '}';
    }
    
}
