package exercicio01;

import java.util.Scanner;

public class Main {

    public static int contarDigitos(int numero){
        int contagem = 0;

        while(numero > 0){
            numero = numero / 10;
            contagem++;
        }

        return contagem;
    }

    public static void exibirDigitos(int[] numeros){
        for(int i = 0; i < 5; i++){
            System.out.println(numeros[i] + " tem " + contarDigitos(numeros[i]) + " digito(s)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        exibirDigitos(numeros);

        sc.close();
    }
}
