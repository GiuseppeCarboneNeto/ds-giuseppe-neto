/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

/**
 *
 * @author CAMARGO
 */

import java.util.Scanner;

public class Exercicio01 {

Scanner scanner = new Scanner(System.in);
        
        
System.out.print("Digite o comprimento do lado a: ");
int a = scanner.nextInt();

System.out.print("Digite o comprimento do lado b: ");
int b = scanner.nextInt();

System.out.print("Digite o comprimento do lado c: ");
int c = scanner.nextInt();

        


int maior, menor1, menor2;
        
        
if (a >= b && a >= c) {
maior = a;
menor1 = Math.max(b, c);
menor2 = Math.min(b, c);
} 
else if (b >= a && b >= c) {
maior = b;
menor1 = Math.max(a, c);
menor2 = Math.min(a, c);
} 
else {
maior = c;
menor1 = Math.max(a, b);
menor2 = Math.min(a, b);
}
        
        
if (maior >= menor1 + menor2) {
System.out.println("Não formam triângulo algum.");
} 
else{        
int maiorQuadrado = maior * maior;      
int menor1Quadrado = menor1 * menor1;
int menor2Quadrado = menor2 * menor2;

            if (maiorQuadrado == menor1Quadrado + menor2Quadrado) {
                System.out.println("Formam um triângulo retângulo.");
            }
	    else if (maiorQuadrado > menor1Quadrado + menor2Quadrado) {
                System.out.println("Formam um triângulo obtusângulo.");
            } 
	    else {
                System.out.println("Formam um triângulo acutângulo.");
            }

           
            if (maior == menor1 && menor1 == menor2) {
                System.out.println("Formam um triângulo equilátero.");
            } 
	    else if (maior == menor1 || maior == menor2 || menor1 == menor2) {
                System.out.println("Formam um triângulo isósceles.");
            }
        }




scanner.close();






}
}