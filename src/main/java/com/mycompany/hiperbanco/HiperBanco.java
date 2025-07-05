/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hiperbanco;

import javax.swing.*;

/**
 *
 * @author franciabrenesrojas
 */
public class HiperBanco {

    public static void main(String[] args) {
        int contadorUsuarios=40;
        Cuenta[] listaCuentas = new Cuenta[99];  //inicialador menu cuentas
        int contadorCuenta = 0;                  //inicialador menu cuentas
        //Instacia cliente 1
        Cliente miCliente1 = new Cliente ("207990557","Benjamin Gamboa","86231503","bgamboa@gmail.com", Estado.activo);
        miCliente1.setUsuario(miCliente1.getNombreCliente().split(" ")[0]+contadorUsuarios);
        miCliente1.setClave("clave"+contadorUsuarios);
        contadorUsuarios++;
        //Instancia cliente 2
        Cliente miCliente2 = new Cliente ("210340171","Christopher Gamboa","83131111","cgamboa@gmail.com", Estado.activo);
        miCliente2.setUsuario(miCliente2.getNombreCliente().split(" ")[0]+contadorUsuarios);
        miCliente2.setClave("clave"+contadorUsuarios);
        contadorUsuarios++;

//        miCliente.agregarClienteID();
//        miCliente.agregarnombreCliente();
//        miCliente.agregartelefonoCliente();
//        miCliente.agregarcorreoCliente();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU PRINCIPAL:\n"
                        + "1- BANCO\n"
                        + "2- CLIENTES\n"
                        + "3- SALIR"));

        if (opcion == 2) {
            while (true) {
                String usuario = JOptionPane.showInputDialog("INGRESE SU USUARIO: ");
                Cliente clienteActual = null;
                if (usuario.equalsIgnoreCase(miCliente1.getUsuario())) {
                    clienteActual = miCliente1;
                } else if (usuario.equalsIgnoreCase(miCliente2.getUsuario())) {
                    clienteActual = miCliente2;
                }
                if (clienteActual != null) {
                    if (clienteActual.getEstado() == Estado.activo) {
                        String clave = JOptionPane.showInputDialog("INGRESE SU CLAVE: ");
                        if (clave.length() != clienteActual.getClave().length() || !clave.equals(clienteActual.getClave())){
                            JOptionPane.showMessageDialog(null, "Clave incorrecta!");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Usuario Autenticado Correctamente!");
                            break;
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente está inactivo!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay ningún cliente con el usuario: " + usuario);
                }
            }
        }
       
        int opcionBanco = Integer.parseInt(JOptionPane.showInputDialog(  //Menu cuentas
            "MENÚ CUENTAS:\n"
                + "1- Agregar nueva cuenta\n"
                + "2- Mostrar cuentas y movimientos\n"
                + "3- Salir"));
        if (opcionBanco == 1){
            AgregarCuenta.agregar__cuenta(listaCuentas, miCliente1, miCliente2, contadorCuenta);
            contadorCuenta++;
        
        }else if(opcionBanco == 2){
            AgregarCuenta.mostrar__cuenta(listaCuentas, contadorCuenta);
        }else{
            JOptionPane.showMessageDialog(null, "Vuelva pronto.");
        }                                                                //Menu Cuentas                                               

    }
}
