import java.util.Scanner;

//Se o usuario responder que o joao tem 18 anos, no console mostrara que: Voce acertou
//Se o usuario responder qualquer outro numero que nao seja 18, no console mostrara que: Voce errou
public class QualAIdadeDoJoao {
    public static void main(String[] args) {
        System.out.println("Quantos anos tem o joao?, Entre o 16 e 20. ");
        Scanner leitor = new Scanner(System.in);
        String resposta = leitor.nextLine();
        resposta = resposta.toLowerCase().trim();
        System.out.println("Voce respondeu: " + resposta);

        if (resposta.equals("")){
            System.out.println("Por favor, Digite algum numero!");
        }else if (resposta.equals("18")){
            System.out.println("Voce acertou :)!");
        }else {
            System.out.println("Voce errou :(!");
        }
    }
}
