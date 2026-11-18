package exercicio09;

import java.util.Scanner;

public class Main {

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int somar(int[] termos){
        int soma = 0;

        for(int i = 0; i < termos.length; i++){
            soma = soma + termos[i];
        }

        return soma;
    }

    public static void exibir(int[] termos){
        System.out.print("Fibonacci: ");

        for(int i = 0; i < termos.length; i++){
            System.out.print(termos[i] + " ");
        }

        System.out.println();
        System.out.println("Soma: " + somar(termos));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        int n = sc.nextInt();

        int[] termos = new int[n];

        for(int i = 0; i < n; i++){
            termos[i] = fibonacci(i);
        }

        exibir(termos);

        sc.close();
    }
}
