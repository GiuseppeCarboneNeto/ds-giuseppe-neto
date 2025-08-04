/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

import java.util.Scanner;


public class Exercicio01 {
    
    
    
    public static void main(String[] args) {
       
    //Gasto Mensal 1 Janeiro
    Scanner GM1 = new Scanner(System.in);
    System.out.println("Coloque o gasto de Janeiro : ");
    float gasto_mensal1 = GM1.nextFloat();

    //Gasto Mensal 2 Fevereiro
    Scanner GM2 = new Scanner(System.in);
    System.out.println("Coloque o gasto Fevereiro : ");
    float gasto_mensal2 = GM2.nextFloat();

    //Gasto Mensal 3 Março
    Scanner GM3 = new Scanner(System.in);
    System.out.println("Coloque o gasto Março : ");
    float gasto_mensal3 = GM3.nextFloat();


    //Banco Trimestral(BT)
    float banco_trimestral;
    banco_trimestral = gasto_mensal1 + gasto_mensal2 + gasto_mensal3;


    //Saida de Gasto Trimestral
    System.out.println("Este é o gasto trimestral: "+banco_trimestral);
        
        
    }
}
