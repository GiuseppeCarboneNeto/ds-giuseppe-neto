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

System.out.print("Código do Funcionário: ");
int codigo = scanner.nextInt();

System.out.print("Sexo (M ou F): ");
char sexo = scanner.next().charAt(0);

System.out.print("Tempo de Serviço em anos: ");
int tempoServico = scanner.nextInt();

System.out.print("Salário: ");
double salario = scanner.nextDouble();

double bonus;
if (sexo == 'M' && tempoServico > 15) {
bonus = 0.20 * salario; 
} else if (sexo == 'F' && tempoServico > 10) {
bonus = 100; 
} else {
bonus = 0; 
}

        
System.out.println("Código do Funcionário: " + codigo);
System.out.printf("Salário: R$ %.2f%n", salario);
System.out.printf("Bônus: R$ %.2f%n", bonus);

scanner.close();






}
}
