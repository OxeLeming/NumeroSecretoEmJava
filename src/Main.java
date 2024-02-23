import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Jogo do Número Secreto!");
        System.out.println();

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        System.out.println(numeroSecreto);

        Scanner leitura = new Scanner(System.in);

        int tentativasRestantes = 5;

        if (tentativasRestantes > 0){
            for (int i = 0; i < 5; i++) {
                System.out.println("Escolha um número entre 1 e 100");
                int numeroChutado = leitura.nextInt();
                tentativasRestantes--;

                if (numeroChutado == numeroSecreto) {
                    System.out.println("Parabéns!!! Você acertou o número secreto");
                    break;
                } else if (numeroChutado < numeroSecreto){
                    System.out.println("Número errado! O numero secreto é maior que " + numeroChutado +".Você possui " + tentativasRestantes + " tentativa (s).");
                } else {
                    System.out.println("Número errado! O numero secreto é menor que " + numeroChutado +".Você possui " + tentativasRestantes + " tentativa (s).");
                }

            }
        }

        if (tentativasRestantes == 0){
            System.out.println("Game Over!");
            System.out.println("Game Over!");
            System.out.println("Game Over!");
        }

    }

}


