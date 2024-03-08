//se o valor do carregador for menor ou = a 50, eu compro
//se o valor do carregador for maior que 50, eu nao compro
public class PrecoDeUmCarregador {
    public static void main(String[] args) {
        int carregador = 60;
        if (carregador <= 50) {
            System.out.println("Eu compro!");
        } else {
            System.out.println("Eu nao compro!");
        }
    }
}