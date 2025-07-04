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

        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU PRINCIPAL:\n"
                            + "1- BANCO\n"
                            + "2- CLIENTES\n"
                            + "3- SALIR"));
            if (opcion == 1) {
                while (true) {
                    int opcionBanco = Integer.parseInt(JOptionPane.showInputDialog(
                            "MENÚ BANCARIO:\n"
                                    + "1 - Generar datos\n"
                                    + "2 - Mostrar clientes\n"
                                    + "3 - Mostrar cuentas y movimientos\n"
                                    + "4 - Agregar nuevo cliente\n"
                                    + "5 - Agregar nueva cuenta\n"
                                    + "6 - Buscar cliente\n"
                                    + "7 - Buscar cuenta\n"
                                    + "8 - Generar reportes\n"
                                    + "9 - Salir del menú bancario"
                    ));
                    if (opcionBanco == 2 ){
                        miCliente1.mostrarClientes();
                        miCliente2.mostrarClientes();
                    }
                    if (opcionBanco == 4){
                        miCliente1.agregarClienteID();
                        miCliente1.agregarnombreCliente();
                        miCliente1.agregartelefonoCliente();
                        miCliente1.agregarCorreoCliente();
                    }
                    if (opcionBanco == 9) {
                        break;
                    }
                }

            }
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
                            if (clave.length() != clienteActual.getClave().length() || !clave.equals(clienteActual.getClave())) {
                                JOptionPane.showMessageDialog(null, "Clave incorrecta!");
                            } else {
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
        }
    }
}
