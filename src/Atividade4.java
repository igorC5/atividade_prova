import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        //AVISO: aqui após terminar a atividade, vejo que teria formas melhores de trabalhar com os arrays e
        // simplificar o processo, no entando o código está funcionando ao que se propõem
        //infelizmente essa percepção só me veio quando já estava quase terminando o código, devido ao fato de não ter lido
        //tudo que foi pedido, mas como dizem, código funcionando é código que não se mexe.

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
        int maior = 0;
        String vencedor = "";
        for (int i = 0; i < votos.length; i++) {
            if (i == 0){
                maior = votos[i];
                vencedor = candidatos[i];
            }
            if (votos[i] > maior){
                maior = votos[i];
                vencedor = candidatos[i];
            }
        }
        System.out.println("===========================================================");
        System.out.println("================ P A R A B E N S ========================================");
        System.out.println("O vencedor foi: " + vencedor);
        System.out.println("===========================================================");
    }
}
