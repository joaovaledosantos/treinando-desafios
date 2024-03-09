import java.util.Scanner;

//Existe duas capa de celular de cores diferente,Preto e branco. se o usuario responder uma dessas, no console mostrara: Voce acertou.
//se o usuario responder outra cor que nao seja igual, no console mostrara: Voce errou.
public class OJoaoUsaDuasCapaDeCelular {
    public static void main(String[] args) {
        System.out.print("Qual a cor das duas capinhas?");
        Scanner leitor = new Scanner(System.in);
        String resposta = leitor.nextLine();
        resposta = resposta.toLowerCase().trim();
        System.out.println("Voce repondeu: " + resposta);

        if (resposta.equals("")){
            System.out.println("Por favor, Informe uma cor!");
        }else if (resposta.equals("branco") || resposta.equals("preto")) {
            System.out.println("Voce acertou :)!");
        } else {
            System.out.println("voce errou :(!");
        }
    }
}
