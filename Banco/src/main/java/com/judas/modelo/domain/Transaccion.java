
package com.judas.modelo.domain;

import java.util.Date;


public class Transaccion {
    private int Id_transaccion;
    private String TipoTransaccion;
    private double monto;
  

    public Transaccion(String TipoTransaccion, double monto) {
        this.TipoTransaccion = TipoTransaccion;
        this.monto = monto;
       
    }

    public int getId_transaccion() {
        return Id_transaccion;
    }

    public void setId_transaccion(int Id_transaccion) {
        this.Id_transaccion = Id_transaccion;
    }

    public String getTipoTransaccion() {
        return TipoTransaccion;
    }

    public void setTipoTransaccion(String TipoTransaccion) {
        this.TipoTransaccion = TipoTransaccion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

   

    
    
}
