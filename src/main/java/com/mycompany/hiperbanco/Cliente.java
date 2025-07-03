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
    public void agregarClienteID() {
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

    //Metodo para agregar el nombre completo 
    public void agregarnombreCliente(){
        while(true){
            String input = JOptionPane.showInputDialog("Ingrese su nombre completo");
            if(input == null) {
                break;
            }
            if(input.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío");
            }
            else {
                this.nombreCliente = input;
                JOptionPane.showMessageDialog(null, "Nombre guardado.");
                break;
            }
        }
    }
    
    
    
    
     //Metodo para el telefono

//        public void agregartelefonoCliente(){
//            while (true){
//            telefonoCliente = JOptionPane.showInputDialog("Ingrese su número de teléfono");
//            
//            if (telefonoCliente.length() == 8 && numeroExp.charAt(5) == '-') {
//                
//                
//            }
//            }
//    
    
   

    // Get para el clienteID
    public String getclienteID() {
        return clienteID;
    }
    
    // Setter con validación
    public void setclienteID(String clienteID) {
       if (clienteID == null || clienteID.length() != 8) {
        JOptionPane.showMessageDialog(null, "Error: El clienteID debe tener exactamente 8 caracteres.");
    } else {
        this.clienteID = clienteID;
        JOptionPane.showMessageDialog(null, "Cédula actualizada correctamente");
    }
    }

    // Get para el nombreCliente
    public String getNombreCliente() {
        return nombreCliente;
    }  
    
    // Set para el nombreCliente
    public void setNombreCliente(String nombreCliente){
        if (nombreCliente == null || nombreCliente.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nombre inválido: no puede estar vacío.");
    } else {
        this.nombreCliente = nombreCliente.trim();
        JOptionPane.showMessageDialog(null, "Nombre asignado correctamente.");
    }
    }
}



