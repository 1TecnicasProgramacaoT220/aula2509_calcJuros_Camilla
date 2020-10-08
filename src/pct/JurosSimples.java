/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author hyran
 */
public class JurosSimples {
    public static void main(String[] args) {
        // Declaração de variáveis
        int j, c, i, n;
        int op;
        
        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Calculadora de Juros --\n");
        
        //Menu
        System.out.println("1. Juros Simples");
        System.out.println("2. Capital");
        System.out.println("3. Prazo");
        System.out.println("4. Taxa");
        System.out.println("5. Sair");
        
        //Usuário informa a opção desejada
        System.out.print("\n\t Opção: ");
        op = entrada.nextInt();
        
        if(op == 1){
            //Apresentação de Juros Simples -- Camilla
            System.out.println("\n\t\t\t -- Juros Simples --\n");
        
            // Entrada
            System.out.print("Informe C: ");
            c = entrada.nextInt();
            System.out.print("Informe I: ");
            i = entrada.nextInt();
            System.out.print("Informe N: ");
            n = entrada.nextInt();
        
            //Processamento
            j = c * i * n / 100;
        
            //Saída 
            System.out.printf("\n %d * %d * %d / 100 = %d\n", c, i, n, j);
        } else if (op == 2) {
            
            //Apresentação de Cálculo de Capital -- Amanda
            System.out.println("\n\t\t\t -- Cálculo de Capital --\n");
        
            //Entrada
            System.out.print("Informe J: ");
            j = entrada.nextInt();
            System.out.print("Informe I: ");
            i = entrada.nextInt();
            System.out.print("Informe N: ");
            n = entrada.nextInt();
        
            //Processamento
            c = (int) (j / ((float)i / 100 * n));
        
            //Saída
            System.out.printf("\n %d / ( %d / 100 * %d ) = %d\n", i, n, j, c);
        } else if (op == 3) {
            
            //Apresentação de Cálculo do Prazo -- Debora
            System.out.println("\n\t\t\t -- Cálculo de Prazo --\n");
        
            //Entrada
            System.out.print("Informe J: ");
            j = entrada.nextInt();
            System.out.print("Informe C: ");
            c = entrada.nextInt();
            System.out.print("Informe I: ");
            i = entrada.nextInt();
        
            //Processamento
            n = (int) (j / ((float)(c * i)/100));
        
            //Saída
            System.out.printf("\n %d / ( %d * ( %d / 100 )) = %d\n", j, c, i, n);
    } else if (op == 4) {
        
            //Apresentação de Cálculo da taxa -- Cecília
            System.out.println("\n\t\t\t -- Cálculo da taxa --\n");
        
            //Entrada
            System.out.print("Informe C: ");
            c = entrada.nextInt();
            System.out.print("Informe J: ");
            j = entrada.nextInt();
            System.out.print("Informe N: ");
            n = entrada.nextInt();
        
            //Processamento
            i = j / ( c * n) * 100;
        
            //Saída
            System.out.printf("\n %d / ( %d * %d ) * 100 = %d\n", j, c, n, i);
    } else if (op == 5) {
            System.out.println("Tenha uma ótima semana!");
    } else {
            System.out.println("Opção " + op + " incorreta!");
    }
        
        
    } 
       
       



        




}
