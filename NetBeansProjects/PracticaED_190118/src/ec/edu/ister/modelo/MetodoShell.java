/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author Cli
 */
public class MetodoShell {
     public int[] shell(int [] array){
        boolean estado;
        for (int i =array.length/2; i >0; i=i== 2? 1: i/2) {
            do{
                estado=false;
                for (int j = 0; j+i<array.length ;j++) {
                    if(array[j+i]< array[j]){
                        int aux = array[j+i];
                        array[j+i]= array[j];
                        array[j]= aux;
                        estado=true;
                    }
                }
            }
            while(estado);
        }
        return array; 
    }
}

    
