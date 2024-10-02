import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informa a quantia de pessoas que irão votar: ");
        int votantes = input.nextInt();

        int taffe = 0;
        int rodrigo = 0;
        int lucas = 0;
        int alessandro = 0;
        int[] votos = {taffe, rodrigo, lucas, alessandro};

        String[] candidatos = {
                "Taffe - 80",
                "Rodrigo - 70",
                "Lucas - 60",
                "Alessandro - 50"
        };

        System.out.println("Os candidatos são:");
        for (int i = 0; i < 4; i++) {
            System.out.println(candidatos[i]);
        }
        System.out.println("===========================================================");

        int voto = 0;
        int[] numsCandidatos = {50, 60, 70, 80};
        for (int i = 0; i < votantes; i++) {
            boolean esta = false;
            while (!esta){
                System.out.println("Votante -" + i + "- Digite o número de seu candidato:");
                voto  = input.nextInt();
                for (int j = 0; j < numsCandidatos.length; j++) {
                    if (voto == numsCandidatos[j]) {
                        esta = true;
                    }
                }
                if (!esta){System.out.println("Digite um candidato válido");}
            }

            switch (voto){
                case 80:
                    votos[0] +=1;
                    break;
                case 70:
                    votos[1] +=1;
                    break;
                case 60:
                    votos[2] +=1;
                    break;
                case 50:
                    votos[3] +=1;
                    break;
                default:
                    break;
            }


        }
        System.out.println("Votos de cada candidato: ");
        for (int j = 0; j < candidatos.length; j++) {
            System.out.println(candidatos[j] + ": " + votos[j]);
        }
    }
}
