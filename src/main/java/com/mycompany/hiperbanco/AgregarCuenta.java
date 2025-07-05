
package com.mycompany.hiperbanco;

/**
 *
 * @author chris
 */

import javax.swing.JOptionPane;
public class AgregarCuenta {
    
    public static boolean decimalValido(String texto){
    boolean punto = false;
    
    if (texto == null || texto.isEmpty()) return false;
    for (int i = 0; i < texto.length(); i++){
    char c = texto.charAt(i);
    if (c == '.'){
    if (punto) return false;
    punto = true;
    }
    else if (c < '0' || c > '9'){
        return false;
    }
         }
    return false;
    }
    
    
    
    
    public static void agregar__cuenta(Cuenta[] listaCuentas, Cliente miCliente1, Cliente miCliente2, int contadorCuenta){
    while (true){
        String idCliente = JOptionPane.showInputDialog("Ingrese el ID del cliente: ");
        Cliente clienteSeleccionado = null;
        
        if (idCliente.equals(miCliente1.getclienteID())){
        
            clienteSeleccionado = miCliente1;
            }
        
        else if (idCliente.equals(miCliente2.getclienteID())){
            clienteSeleccionado = miCliente2;
            }
        if (clienteSeleccionado == null){
            String repetir = JOptionPane.showInputDialog("Cliente no econtrado.\nDigite '1' para intentar de nuevo o digite 2 para cancelar");
            if (!repetir.equals("1")){
                return;
            } else{
                continue;
            }
        }
        TipoCuenta tipo = null;
        String tipoStr = JOptionPane.showInputDialog(
        "Seleccione el tipo de cuanta: \n1. Corriente\n2. Ahorros\n3. Inversión\n4. Planilla");
        if (tipoStr == null) return;
        if (tipoStr.equals("1")) tipo = TipoCuenta.corriente;
        else if (tipoStr.equals("2")) tipo = TipoCuenta.ahorros;
        else if (tipoStr.equals("3")) tipo = TipoCuenta.inversion;
        else if (tipoStr.equals("4")) tipo = TipoCuenta.planilla;
        else {
        JOptionPane.showInputDialog(null, "Por favor elija una opción válida");
        return;
        }
        
        double saldoInicial = -1;
        
        while (true){
        String saldoStr = JOptionPane.showInputDialog("Ingrese su saldo inicial: ");
        
        if (saldoStr == null) return;
        
        if (!decimalValido(saldoStr)){
        JOptionPane.showMessageDialog(null, "Por favor ingrese un numero válido");
            continue;
        }
        
        saldoInicial = Double.parseDouble(saldoStr);
        
        if (saldoInicial < 0){
        String repetir = JOptionPane.showInputDialog("El saldo debe ser mayor o igual a 0.\nDigite '1' para intentar de nuevo o digite 2 para cancelar");
            if (!repetir.equals("1")) return;
            continue;
        }
        
        break;
       }
        
        Cuenta nuevaCuenta = new Cuenta(tipo, saldoInicial, clienteSeleccionado);
        clienteSeleccionado.agregarCuenta(nuevaCuenta);
        
        if (contadorCuenta < listaCuentas.length){
            listaCuentas[contadorCuenta] = nuevaCuenta;
            JOptionPane.showMessageDialog(null, "Se ha creado una cuenta, número: " + nuevaCuenta.getNumeroCuenta());
        
        }else{
           JOptionPane.showMessageDialog(null, "No se pueden crear más cuentas"); 
        }
        
        break;
    }
        
        
        
        }
    
    public static void mostrar__cuenta(Cuenta[] listaCuentas, int totalCuentas){
        System.out.println("--Cuentas registradas--");
        
        for (int i = 0; i < totalCuentas; i++){
            Cuenta c = listaCuentas[i];
            if (c !=null){
                System.out.println("Número de cuenta: " + c.getNumeroCuenta());
                System.out.println("Tipo de cuenta: " + c.getTipo());
                System.out.println("Fecha de apertura: " + c.getFechaApertura());
                System.out.println("Saldo: " + c.getSaldoInicial());
                System.out.println("Tarjetahabiente: " + c.getCliente().getNombreCliente());
            }
            
            System.out.println("----------------------------------------------------");
    }
    }
}
