package com.mycompany.hiperbanco;

import javax.swing.JOptionPane;

public class MenuBancoCliente { //varible de instancia
    
    private Cliente cliente1;
    private Cliente cliente2;
    private Cuenta [] cuentasTotales;
    private int todasCuentasTotales;
    
    public MenuBancoCliente(Cliente c1, Cliente c2, Cuenta[] cuentas, int totalCuentas){ //Constructor
    this.cliente1 = c1;
    this.cliente2 = c2;
    this.cuentasTotales = cuentas;
    this.todasCuentasTotales = totalCuentas;
    }
    
    public void mostrar(){
    String opcionCliente = "-----Sección Clientes-----"
            + "\n1. Mostrar clientes."
            + "\n2. Mostrar cuentas."
            + "\n3. Agregar cliente."
            + "\n4. Agregar cuenta.";
    
    JOptionPane.showMessageDialog(null, opcionCliente);  
    
    
         if (opcionCliente.equals("1")) {
            JOptionPane.showMessageDialog(null, "Clientes registrados."); //Se nuestran los clientes registrados y si
        } if (cliente1 != null) {                                         // si no hay clientes registrados
            cliente1.mostrarClientes();
        } if (cliente2 != null) {
            cliente2.mostrarClientes();
        } if (cliente1 == null && cliente2 == null) {
            JOptionPane.showMessageDialog(null, "No se encuentran clientes registrados en el sistema");
        } 
        else if (opcionCliente.equals("2")) {
            AgregarCuenta.mostrar__cuenta(cuentasTotales, todasCuentasTotales); //Se muestran las cuentas
        } 
        else if (opcionCliente.equals("3")) {
            Cliente nuevoCliente = null;
            boolean accionCancelada = false;
            
          if (cliente1 == null) {
              nuevoCliente = new Cliente(null, null, null, null, null);
             
              nuevoCliente.agregarClienteID();
              if (nuevoCliente.getclienteID() == null) {accionCancelada = true;}
              
              if (!accionCancelada) {
                  nuevoCliente.agregarnombreCliente();
                  if(nuevoCliente.getNombreCliente() == null){accionCancelada = true;}
              }
              if(!accionCancelada){
              nuevoCliente.agregartelefonoCliente();
                 if(nuevoCliente.getTelefonoCliente() == null){accionCancelada = true;}
              }
               if (accionCancelada) {
                      nuevoCliente.agregarCorreoCliente();
                      if(nuevoCliente.getCorreoCliente() == null) {accionCancelada = true;}
                  }
              } else if(cliente2 == null){
               nuevoCliente = new Cliente(null, null, null, null, null);
               accionCancelada = false;
               
               nuevoCliente.agregarClienteID();
               if (nuevoCliente.getclienteID() == null) { accionCancelada = true;}
               if (!accionCancelada) {
                  nuevoCliente.agregarnombreCliente();
                   if (nuevoCliente.getNombreCliente() == null) {accionCancelada = true;}
              }
               if (!accionCancelada) {
                  nuevoCliente.agregartelefonoCliente();
                   if (nuevoCliente.getTelefonoCliente() == null) {accionCancelada = true;}
              }
              if (!accionCancelada) {
                  nuevoCliente.agregarCorreoCliente();
                  if (nuevoCliente.getCorreoCliente() == null) {accionCancelada = true;}
              }
              if (!accionCancelada) {
                  nuevoCliente.setEstado(Estado.activo);
                  this.cliente2 = nuevoCliente;
                  JOptionPane.showMessageDialog(null, "El cliente 2 ha sido registrado con éxito");
              }
              } else{
              JOptionPane.showMessageDialog(null, "Ya existen los dos clientes requeridos, no se pueden agregar más");
              }
              } else if (opcionCliente.equals("4")) {
              AgregarCuenta.agregar__cuenta(cuentasTotales, cliente1, cliente2, todasCuentasTotales);
              } else {
                  JOptionPane.showMessageDialog(null, "La opción ingresada no es válida");
               }
        }
              }
        

   


    

