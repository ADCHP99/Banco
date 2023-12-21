/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.judas.modelo.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adchp
 */
public class Cliente {
    private int Id_cliente;
    private String nombre;
    private String direccion;
    private int numero_Telefono;
    private List<CuentaBancaria> cuentas;

    public Cliente(int Id_cliente, String nombre, String direccion, int numero_Telefono) {
        this.Id_cliente = Id_cliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero_Telefono = numero_Telefono;
        this.cuentas= new ArrayList<>();        
    }

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero_Telefono() {
        return numero_Telefono;
    }

    public void setNumero_Telefono(int numero_Telefono) {
        this.numero_Telefono = numero_Telefono;
    }

    public void CrearCuenta(CuentaBancaria cuenta){
        cuentas.add(cuenta);
    } 

    @Override
    public String toString() {
        return "Cliente{" + "Id_cliente=" + Id_cliente + ", nombre=" + nombre + ", direccion=" + direccion + ", numero_Telefono=" + numero_Telefono + ", cuentas=" + cuentas + '}';
    }

    
    
  
    
    
            
}
