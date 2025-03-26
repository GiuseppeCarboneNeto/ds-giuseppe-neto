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
        
// Inputs para Exercício 1
System.out.print("Digite o nome do funcionário: ");
String nome = scanner.nextLine();
        
System.out.print("Digite o número de horas trabalhadas: ");
int horasTrabalhadas = scanner.nextInt();
        
System.out.print("Digite o valor recebido por hora: ");
double valorHora = scanner.nextDouble();
        
System.out.print("Digite o número de filhos com idade inferior a 14 anos: ");
int numeroFilhos = scanner.nextInt();
        
System.out.print("Digite a idade do funcionário: ");
int idade = scanner.nextInt();
        
System.out.print("Digite o tempo de serviço do funcionário (em anos): ");
int tempoServico = scanner.nextInt();
        
System.out.print("Digite o valor do salário família por filho: ");
double salarioFamiliaPorFilho = scanner.nextDouble();
        
// Cálculo do salário bruto
double salarioBruto = horasTrabalhadas * valorHora;
        
// Cálculo do INPS (8.5% do salário bruto)
double descontoINPS = salarioBruto * 0.085;
        
// Cálculo do salário família
double salarioFamilia = numeroFilhos * salarioFamiliaPorFilho;
        
// Cálculo do Imposto de Renda
double impostoRenda = 0;
if (salarioBruto > 1500) {
            impostoRenda = salarioBruto * 0.15;
} else if (salarioBruto >= 500) {
            impostoRenda = salarioBruto * 0.08;
}
        
// Cálculo do adicional
double adicional = 0;
if (idade > 40) {
            adicional = salarioBruto * 0.02;
}
if (tempoServico > 15) {
            adicional += salarioBruto * 0.035;
} else if (tempoServico > 5 && tempoServico <= 15 && idade > 30) {
            adicional += salarioBruto * 0.015;
}
        
// Cálculo do salário líquido
double totalDescontos = descontoINPS + impostoRenda;
double salarioLiquido = salarioBruto + salarioFamilia + adicional - totalDescontos;
        
// Exibição dos resultados
System.out.println("\nFuncionário: " + nome);
System.out.println("Salário Bruto: R$" + salarioBruto);
System.out.println("Total de Descontos: R$" + totalDescontos);
System.out.println("Adicional: R$" + adicional);
System.out.println("Salário Líquido: R$" + salarioLiquido);
        
scanner.close();


}
}
