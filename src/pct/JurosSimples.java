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
        
        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação de Juro Simples -- Camilla
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
        
        //Apresentação de Cálculo de Capital -- Amanda
        System.out.println("\n\t\t\t -- Cálculo de Capital --\n");
        
        //Entrada
        System.out.print("Informe I: ");
        i = entrada.nextInt();
        System.out.print("Informe N: ");
        n = entrada.nextInt();
        System.out.print("Informe J: ");
        j = entrada.nextInt();
        
        //Processamento
        c = j /  (i / 100 * n);
        
        //Saída
        System.out.printf("\n %d / ( %d / 100 * %d ) = %d\n", i, n, j, c);
        
        //Apresentação de Cálculo do prazo -- Debora
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

    }
    
}
