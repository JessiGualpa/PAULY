/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.ListaCircularPalabra;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Cli
 */
public class Aplicaciones {
    public static void main(String[] args) throws IOException {
        String palabra;
        ListaCircularPalabra listacp;
        int opc;
        BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
        
        listacp=new ListaCircularPalabra();
        System.out.println("entrada de los nombres.termina en  z.");
        while((palabra=entrada.readLine())!=null){
            String nueva;
            nueva=new String(palabra);
            listacp.insertar(nueva);
        }
        System.out.println("lista circular palabra ");
        listacp.recorrer();
        System.out.println("opciones para manejar listas");
        do{
             System.out.println("1. eliminar una palabra");
              System.out.println("2. mostrar lista completa");
               System.out.println("salir e eliminar lista completa");
               do{
                   opc=Integer.parseInt(entrada.readLine());
                   
               }while(opc<1 || opc>3);
               switch(opc){
                   case 1: System.out.println("palabra a eliminar");
                       palabra=entrada.readLine();
                       listacp.eliminar(palabra);
                       break;
                   case 2:
                        System.out.println("palabra en la lista");
                       listacp.recorrer();
                       break;
                   case 3:
                        System.out.println("eliminacion de listas");
                       listacp.borrarlista();
               }
               
        }while(opc !=3);
        
    }
    
}
