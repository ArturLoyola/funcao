package exercicio06;

import java.util.Scanner;

public class Main {

    public static String gerarIniciais(String nomeCompleto){
        String[] partes = nomeCompleto.split(" ");
        String iniciais = "";

        for(int i = 0; i < partes.length; i++){
            if(!partes[i].isEmpty()){
                iniciais = iniciais + partes[i].toUpperCase().charAt(0) + ".";
            }
        }

        return iniciais;
    }

    public static void exibirChamada(String[] nomes){
        for(int i = 0; i < 4; i++){
            System.out.println((i + 1) + ". " + nomes[i] + " (" + gerarIniciais(nomes[i]) + ")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[4];

        for(int i = 0; i < 4; i++){
            System.out.print("Nome do aluno: ");
            nomes[i] = sc.nextLine();
        }

        exibirChamada(nomes);

        sc.close();
    }
}
