import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.println("Me diga a quantia de carros: ");
        int quantia = input.nextInt();
        int[] carros = new int[quantia];

        int soma = 0;
        int media = 0;

        for(int i = 1; i <= quantia; i++){
            System.out.println("Me diga a avaliação do carro " + i);
            carros[i-1] = input.nextInt();
            soma += carros[i-1];
        }
        media = soma/quantia;
        System.out.println("A soma das notas dos carros é: " + soma);
        System.out.println("A media dos carros é: " + media);

        int menorSeis = 0;
        int maiorSeis = 0;
        int invalidos = 0;
        for(int i = 0; i < quantia; i++){
            if(carros[i] >= 11 || carros[i] < 0){
                invalidos+=1;
            } else if (carros[i] >= 6) {
                maiorSeis+=1;
            } else if (carros[i] < 6) {
                menorSeis+=1;
            }
        }
        System.out.println("A quantidade de carros avaliados como bons é: " + maiorSeis);
        System.out.println("A quantidade de carros avaliados como ruins é: " + menorSeis);
        System.out.println("A quantia de motas invalidas(fora do intervalo 0-10) é " + invalidos);
    }
}