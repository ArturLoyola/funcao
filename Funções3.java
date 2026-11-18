package exercicio03;

import java.util.Scanner;

public class Main {

    public static boolean ehPrimo(int numero){
        if(numero <= 1){
            return false;
        }

        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void exibirPrimos(int[] numeros){
        System.out.print("Primos: ");

        for(int i = 0; i < 8; i++){
            if(ehPrimo(numeros[i])){
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

        for(int i = 0; i < 8; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        exibirPrimos(numeros);

        sc.close();
    }
}
