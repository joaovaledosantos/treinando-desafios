import java.util.Scanner;
//se a cor que voce respondeu do celular do joao for "Preto", Voce acertou!
//se voce tiver respondido qualquer outra cor, voce errou!
public class CorDoMeuCelular {
    public static void main(String[] args) {
        System.out.print("Qual a cor do celular do Joao?");
        Scanner leitor = new Scanner(System.in);
        String resposta = leitor.nextLine();
        System.out.println("Voce respondeu: " + resposta);

        if (resposta.equals("preto"))  {
            System.out.println("Parabens, Voce acertou!");
        }else {
            System.out.println("Voce errou!");
        }
    }
}