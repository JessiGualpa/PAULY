/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.ister;

import static java.rmi.Naming.list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pauly gualpa 
 * tercero sistemas 
 */
public class Ejerciciosfinal{
    
    public static void  llenararreglo() {
        int array[]=new int[10];
        for (int i = 0; i < array.length; i++){
        array[i]=(int)(Math.random()*10);
            
        }   
    }
    public  static void imprimir(){
        String[] arraytemperatura={"arreglo"};
    String acu="";
     for (int i = 0; i < arraytemperatura.length; i++){
      acu+= arraytemperatura[i]+"";
}
      JOptionPane.showMessageDialog(null, acu);
    }
    public static void ordenar(){
        int array[]=new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*10);
            Arrays.sort(array);
            JOptionPane.showMessageDialog(null, array[i]);
            
        }
    }
    public static void maximo() {
        int array[]=new  int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*10);
            List<Integer> arr=new ArrayList();
            
            arr= Arrays.asList(array[i]);
            Integer max= Collections.max(arr);
            JOptionPane.showMessageDialog(null, max);
        }
        }
        public  static void menu(){
            int op;
            do{
            op=Integer.parseInt(JOptionPane.showInputDialog("a.- ingrese las opciones a escoger:\n"
                 + "menu :\n" 
               + "a.-llenar el arreglo\n"
               + "b.- imprimir el arreglo\n"
               + "c.- ordenar el arreglo \n"
               + "d.- hallar el maximo de un arreglo \n"
               + "e.- Salir"));
            switch(op){
                case 'a':
                    llenararreglo();
                    break;
                case 'b':
                    imprimir();
                    break;
                case 'c':
                   ordenar();
                    break;
                case 'd':
                   maximo();
                    break;
                case 'e':
                    System.exit(0);
                    break;
            }
        }while (op!='f');
    }
}

            
        
        
    

