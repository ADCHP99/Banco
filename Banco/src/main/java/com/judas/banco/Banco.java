/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.judas.banco;

import com.judas.modelo.domain.Cliente;
import com.judas.modelo.domain.CuentaBancaria;
import javax.swing.JOptionPane;

/**
 *
 * @author adchp
 */
public class Banco {
   
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String direccion = JOptionPane.showInputDialog("Ingrese su Direccion");
        int numeroTelefono=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de Telefono"));
        Cliente c1 = new Cliente(1, nombre, "Babahoyo", 222221111);
        
        CuentaBancaria cuenta1 = new CuentaBancaria(1, 200, "Ahorro", c1);
        System.out.println(c1);
        double saldoActual = cuenta1.verSaldo();
        System.out.println(saldoActual);
        
    }
}
