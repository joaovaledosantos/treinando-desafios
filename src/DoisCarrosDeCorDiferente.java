import java.util.Scanner;

//Existe dois carros de cores diferentes,Vermelho e prata. Se o usuario informar uma delas: Voce acertou
// Se o usuario informar outra cor que nao seja igual: Voce errou
public class DoisCarrosDeCorDiferente {
    public static void main(String[] args) {
        System.out.print("Qual a cor dos dois carros?");
        Scanner leitor = new Scanner(System.in);
        String resposta = leitor.nextLine();
        resposta = resposta.toLowerCase().trim();
        System.out.println("Voce respondeu: " + resposta);

        if (resposta.equals("vermelho") || resposta.equals("prata")){
            System.out.println("Voce acertou!");
        }else{
            System.out.println("Voce errou!");
        }
    }
}
