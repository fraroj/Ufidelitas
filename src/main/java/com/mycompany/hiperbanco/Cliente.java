package com.mycompany.hiperbanco;
import javax.swing.JOptionPane;

//Clase Cliente
public class Cliente {

    //Atributos
    private String clienteID;
    private String nombreCliente;
    private String telefonoCliente;
    private String correoCliente;

    // Constructor
    public Cliente(String clienteID, String nombreCliente, String telefonoCliente, String correoCliente){
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
            else if(input.trim().isEmpty()){
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

        public void agregartelefonoCliente() {
    for (int i = 0; i < 3; i++) {
        telefonoCliente = JOptionPane.showInputDialog("Ingrese su número de teléfono en el siguiente formato 0000-0000");

        if (telefonoCliente == null) {
            break;
        }else if (telefonoCliente.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El numero de telefono no puede estar vacío. Intento: " + (i + 1));
            
        } else if (telefonoCliente.length() != 9 || telefonoCliente.charAt(4) != '-') {
            JOptionPane.showMessageDialog(null,
                "El número de teléfono no cumple con los requisitos mínimos.\n"
              + "- Mínimo 8 caracteres.\n"
              + "- Formato: 0000-0000.\n"
              + "Inténtelo nuevamente: " + (i + 1)); 
        } else {
            this.telefonoCliente = telefonoCliente;
            JOptionPane.showMessageDialog(null, "Teléfono guardado satisfactoriamente.");
            break;
        }
    }
}
        
        //Metodo para validar el correo electronico del cliente
        public void agregarcorreoCliente(){
        correoCliente = JOptionPane.showInputDialog("Ingrese su correo electronico en el siguiente formato xxxx@.xxx.com" );
        for (int i = 0; i < 3; i++) {
        if (correoCliente == null) {
           break;
        } else if (correoCliente.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El correo no puede estar vacio. Intento : " + (i + 1));
        } else if (!correoCliente.contains("@")) {
    JOptionPane.showMessageDialog(null,
        "El correo no cumple con los requisitos mínimos.\n"
      + "- Debe contener un '@'.\n"
      + "- Debe contener un punto '.' después del '@'.\n"
      + "Inténtelo nuevamente: " + (i + 1)); 

    } else if (!correoCliente.contains(".") || 
               correoCliente.indexOf('@') > correoCliente.lastIndexOf('.')) {

        JOptionPane.showMessageDialog(null,
            "El correo no cumple con los requisitos mínimos.\n"
          + "- Debe contener un '@'.\n"
          + "- Debe contener un punto '.' después del '@'.\n"
          + "Inténtelo nuevamente: " + (i + 1)); 

    } else {
        this.correoCliente = correoCliente;
        JOptionPane.showMessageDialog(null, "Correo guardado satisfactoriamente.");
        break;
    }
 }        
        
        
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
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
    public String getTelefonoCliente() {
    return telefonoCliente;
    }
    
    public void setTelefonoCliente(String telefonoCliente) {
    // Validar que no sea null
    if (telefonoCliente == null) {
        JOptionPane.showMessageDialog(null, "El teléfono no puede ser nulo.");
        
    } else if (telefonoCliente.trim().isEmpty()) {
        // Validar que no esté vacío
        JOptionPane.showMessageDialog(null, "El número de teléfono no puede estar vacío.");
        
    } else if (telefonoCliente.length() != 9 || telefonoCliente.charAt(4) != '-') {
        // Se valida formato: debe tener 9 caracteres y un guion en posición 4
        JOptionPane.showMessageDialog(null,
            "El número de teléfono no cumple con los requisitos mínimos.\n" +
            "- Mínimo 8 caracteres (más el guion son 9).\n" +
            "- Formato correcto: 0000-0000");
            
    } else {
        // Si todo es válido - se asigna valor
        this.telefonoCliente = telefonoCliente;
        JOptionPane.showMessageDialog(null, "Teléfono actualizado correctamente.");
    }
}
    
    
    
    
    
}



