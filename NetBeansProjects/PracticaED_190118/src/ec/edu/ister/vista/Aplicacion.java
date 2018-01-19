/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.MetodoShell;

/**
 *
 * @author pauly
 */
public class Aplicacion {
    public static void main(String[] args) {
        int []num = {8, 43, 17, 6, 40, 16, 18, 97, 11, 7};
        System.out.println("Array[] =            { 8 43 17 6 40 16 18 97 11 7};");
        MetodoShell var =  new MetodoShell();
        int result[] = var.shell(num);
        System.out.printf("Ordenacion Shell[] = {");
        for (int i = 0; i < result.length; i++) {
            System.out.printf(" "+result[i]);
        }
        System.out.println("}");
    }
}

