package com.mycompany.hiperbanco;

import javax.swing.JOptionPane;

public class MenuHiperBanco {

    public static void main(String[] args) {
        mostrarMenu();
    }
        
         public static void mostrarMenu(){
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de Hiper Banco, seleccione alguna de las siguientes opciones del menú principal.");
        
         Cliente cliente1 = null;
    Cliente cliente2 = null;
    
    Cuenta[] cuentasTotales = new Cuenta[10];
    int todasCuentasTotales = 0;
    
        
        
        String menu = "-----Menú Principal-----"
                + "\n1. Banco"
                + "\n2. Clientes"
                + "\n3. Salir";
        JOptionPane.showMessageDialog(null, menu);
        
        String opcion = JOptionPane.showInputDialog("Ingrese la opción a realizar.");
        
        if (opcion.equals("1")){
      
        } else if(opcion.equals("2")){
        JOptionPane.showMessageDialog(null, "Sección de clientes." );
        Cliente clienteIngresado = null; //Variable en la cual se almacena el cliente ingresado
        
            if (cliente1 != null && cliente1.getUsuario() != null && cliente1.getClave() != null) {
                clienteIngresado = cliente1;
            } else if (cliente2 != null && cliente2 !=null && cliente2.getUsuario() != null && cliente2.getClave() != null) {
                clienteIngresado = cliente2;
            }
            if (clienteIngresado!= null) {
                JOptionPane.showMessageDialog(null, "Ingreso exitoso del cliente: " + clienteIngresado.getNombreCliente());
            }
        } else if (opcion.equals("3")){
        JOptionPane.showMessageDialog(null, "Ha decidido salir, gracias por usar el sistema de Hiper Banco.");
        } else {
        JOptionPane.showMessageDialog(null, "La opción es inválida, vuelva a intentarlo.");
        
        
        
        
        
        
        
        
        
        
        
        
        }
    }
        
        
        
        
        
        
        
        
        
    }
    

