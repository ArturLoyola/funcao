package exercicio07;

import java.util.Scanner;

public class Main {

    public static String inverter(String texto){
        String invertido = "";

        for(int i = texto.length() - 1; i >= 0; i--){
            invertido = invertido + texto.charAt(i);
        }

        return invertido;
    }

    public static boolean ehPalindromo(String texto){
        texto = texto.replace(" ", "").toLowerCase();

        return texto.equals(inverter(texto));
    }

    public static void exibirResultado(String frase){
        if(ehPalindromo(frase)){
            System.out.println(frase + " e palindromo");
        }else{
            System.out.println(frase + " nao e palindromo");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] frases = new String[3];

        for(int i = 0; i < 3; i++){
            System.out.print("Digite uma frase: ");
            frases[i] = sc.nextLine();
        }

        for(int i = 0; i < 3; i++){
            exibirResultado(frases[i]);
        }

        sc.close();
    }
}
