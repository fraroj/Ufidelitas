
package com.mycompany.hiperbanco;
import javax.swing.JOptionPane;

//Clase Cliente
public class Cliente {
    
    //Atributos
    
    private int clienteID;
    private String nombreCliente;
    private int telefonoCliente;
    private String correoCliente;
    
  //Metodo constructores
    public Cliente(int clienteID, String nombreCliente, int telefonoCliente, String correoCliente){
    this.clienteID= clienteID;
    this.nombreCliente=nombreCliente;
    this.telefonoCliente=telefonoCliente;
    this.correoCliente=correoCliente;
    
    }
    
    
    //Metodos de clases
    
    public void AgregarCliente(){
        
    while (true){
        clienteID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cedula de identificacion"));
                
    }
    
    
          
    
    }
    
    
    
    
    
    
}
