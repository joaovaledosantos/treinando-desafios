import java.util.Scanner;

//Se o salario de um dev junior for menor ou igual a 7.000, voce acertou!
//Se o salario de um dev junior for maior que 7.000, voce errou!
public class SalarioDeUmDevJunior {
    public static void main(String[] args) {
        System.out.print("Quanto e o salario de um Dev junior?");
        Scanner leitor = new Scanner(System.in);
        String resposta = leitor.nextLine();
        System.out.println("Voce respondeu: " + resposta);

        if (resposta.equals("7000")) {
            System.out.println("Voce acertou :)!");
        } else {
            System.out.println("Voce errou :(!");
        }
    }
}
