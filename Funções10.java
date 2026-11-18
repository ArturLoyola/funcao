package exercicio10;

import java.util.Scanner;

public class Main {

    public static int contarMovimentos(int discos){
        if(discos == 1){
            return 1;
        }

        return 2 * contarMovimentos(discos - 1) + 1;
    }

    public static void hanoi(int n, char origem, char destino, char auxiliar){
        if(n == 1){
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
        }else{
            hanoi(n - 1, origem, auxiliar, destino);

            System.out.println("Mover disco " + n + " de " + origem + " para " + destino);

            hanoi(n - 1, auxiliar, destino, origem);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] discos = new int[3];
        int total = 0;

        for(int i = 0; i < 3; i++){
            System.out.print("Quantidade de discos do jogo " + (i + 1) + ": ");
            discos[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            System.out.println("\nJogo " + (i + 1) + ":");

            hanoi(discos[i], 'A', 'C', 'B');

            int movimentos = contarMovimentos(discos[i]);
            System.out.println("Total de movimentos: " + movimentos);

            total = total + movimentos;
        }

        System.out.println("\nTotal de movimentos dos 3 jogos: " + total);

        sc.close();
    }
}
