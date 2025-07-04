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

        miCliente1.agregarClienteID();
        miCliente1.agregarnombreCliente();
        miCliente1.agregartelefonoCliente();
        miCliente1.agregarCorreoCliente();


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
}
