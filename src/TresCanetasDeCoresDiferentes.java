import java.util.Scanner;

//Joao tem 3 canetas de cores diferetes, azul, preta e vermelha
//se eu responder qualquer outra cor diferente, no console mostrara que ERREI.
public class TresCanetasDeCoresDiferentes {
    public static void main(String[] args) {
        System.out.println("Qual a cor das 3 canetas de Joao?");
        Scanner leitor = new Scanner(System.in);
        String resposta = leitor.nextLine();
        resposta = resposta.toLowerCase().trim();
        System.out.println("A cor da caneta que voce respondeu foi: " + resposta);

        if (resposta.equals("")) {
            System.out.println("E obrigatorio informar uma cor!");
        } else if (resposta.equals("azul") || resposta.equals("preta") || resposta.equals("vermelha")) {
            System.out.println("Voce acertou :)!");
        } else {
            System.out.println("Voce errou :(!");
        }
    }
}
