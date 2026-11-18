package exercicio02;

import java.util.Scanner;

public class Main {

    public static int inverterNumero(int numero){
        int invertido = 0;

        while(numero > 0){
            invertido = invertido * 10 + numero % 10;
            numero = numero / 10;
        }

        return invertido;
    }

    public static void exibirInvertidos(int[] numeros){
        for(int i = 0; i < 5; i++){
            System.out.println(numeros[i] + " ao contrario: " + inverterNumero(numeros[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        exibirInvertidos(numeros);

        sc.close();
    }
}
