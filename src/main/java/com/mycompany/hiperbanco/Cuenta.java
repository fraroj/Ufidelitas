
package com.mycompany.hiperbanco;

import java.time.LocalDate;


public class Cuenta {
    private static int contadorCuenta = 4710;
    private int numeroCuenta;
    private TipoCuenta tipo;
    private LocalDate fechaApertura;
    private double saldoInicial;
    private Cliente cliente;
    
    public Cuenta(TipoCuenta tipo, double saldoInicial, Cliente cliente){
        this.numeroCuenta = contadorCuenta++;
        this.tipo = tipo;
        this.fechaApertura = LocalDate.now();
        this.saldoInicial = saldoInicial;
        this.cliente = cliente;
    }
     
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public double getSaldoInicial(){
        return saldoInicial;
    }
    
    public TipoCuenta getTipo(){
        return tipo;
    }
    
    public LocalDate getFechaApertura(){
        return fechaApertura;
    }
    
    public void mostrar__cuenta(){
        System.out.println("Cuenta número: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipo);
        System.out.println("Saldo inicial: " + saldoInicial);
        System.out.println("Fecha de Apertura: " + fechaApertura);
        System.out.println("Cliente: " + cliente.getNombreCliente() + "Identificación: " + cliente.getclienteID());
        System.out.println("---------------");
    }
    

}

