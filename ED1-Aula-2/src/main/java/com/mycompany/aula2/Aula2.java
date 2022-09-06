/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula2;

/**
 *
 * @author deborah
 */

    public class Aula2 {

        public static void main(String[] args) {
            System.out.println("raiz:" + Math.sqrt(64));
            System.out.println("\nraiz com exp e log e realint: " + Math.round(Math.exp(Math.log(Math.sqrt(64)))));
            System.out.println("\nraiz com exp e log sem realint: " + Math.exp(Math.log(Math.sqrt(64))));
            System.out.println(String.format("\n%.3f", (Math.sin(45*Math.PI/180)) + 0.0001));
            System.out.println("\npotencia com exp e log e formatar: " + (String.format("%.3f", Math.exp(3*Math.log(8))+0.001)));
            System.out.println("\npotencia com exp e log sem formatar: " + Math.exp(3*Math.log(8)));
            System.out.println("\npotencia com operador ** e formatar: " + (String.format("%.3f", Math.pow(8, 3))));
            System.out.println("\nraiz cubica: " + Math.cbrt(8));
            System.out.println("\nabsoluto: " + Math.abs(-8));
            System.out.println("\nabsoluto: " + Math.abs(8));
            System.out.println("\nconvertendo para inteiro 5.5: " + Math.round(5.5));
            System.out.println("\nconvertendo para inteiro 6.5: " + Math.round(6.5));
            System.out.println("\nconvertendo para inteiro 6.5 + 0.0001: " + Math.round(6.5 + 0.0001));
            System.out.println("\nconvertendo para inteiro 5.45: " + Math.round(5.45));
            System.out.println("\nconvertendo para inteiro 5.51: " + Math.round(5.51));
            System.out.println("\nconvertendo para real 87: " + (float)87);
            System.out.println("\nconvertendo para inteiro 3/4: " + Math.round((float) 3 / (float) 4));
            
         
            
            
        }
    }
