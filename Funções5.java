package exercicio05;

import java.util.Scanner;

public class Main {

    public static int contarVogais(String texto){
        int contagem = 0;
        texto = texto.toLowerCase();

        for(int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);

            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contagem++;
            }
        }

        return contagem;
    }

    public static void exibirContagem(String[] frases){
        for(int i = 0; i < 3; i++){
            System.out.println(frases[i] + " tem " + contarVogais(frases[i]) + " vogais");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] frases = new String[3];

        for(int i = 0; i < 3; i++){
            System.out.print("Digite uma palavra ou frase: ");
            frases[i] = sc.nextLine();
        }

        exibirContagem(frases);

        sc.close();
    }
}
