
package com.mycompany.hiperbanco;
import javax.swing.JOptionPane;

//Clase Cliente
public class Cliente {

    //Atributos
    private String clienteID;
    private String nombreCliente;
    private int telefonoCliente;
    private String correoCliente;

    // Constructor
    public Cliente(String clienteID, String nombreCliente, int telefonoCliente, String correoCliente){
        this.clienteID = clienteID;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
    }

    // Método para agregar clienteID con máximo 3 intentos
    public void agregarclienteID() {
        for (int i = 0; i < 3; i++) {
            clienteID = JOptionPane.showInputDialog("Ingrese su cedula de identificacion");
            if(clienteID == null){
            break;
            }
            if (clienteID.length() != 8) {
                JOptionPane.showMessageDialog(null, "La cedula debe tener 8 caracteres. Intento número: " + (i + 1));
            } else {
                this.clienteID = clienteID;
                JOptionPane.showMessageDialog(null, "Cédula válida");
                break; // Salimos del bucle si es válido
            }
        }
    }

    // Getter
    public String getClienteID() {
        return clienteID;
    }

    // Setter con validación
    public void setClienteID(String clienteID) {
        if(clienteID == null){
            }
        if (clienteID.length() != 8) {
            this.clienteID = clienteID;
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar: La cedula debe tener 8 caracteres.");
        }
    }
}
    
    
    
   
