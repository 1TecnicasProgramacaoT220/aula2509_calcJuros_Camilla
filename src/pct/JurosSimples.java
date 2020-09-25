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
        
        //Apresentação
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
        
               
      
    }
    
}
