//se a fiat toro for = ou menos que 100.000, eu compro
//se a fiat toro for maior que 100.000, eu nao compro
public class PrecoDeUmaFiatToro {
    public static void main(String[] args) {
        double preco = 100000;
        if (preco <= 100000) {
            System.out.println("Se o preço e menor ou igual a 100.000, Eu compro!");
        }else{
            System.out.println("Se o preço e maior que 100.000,Eu nao compro!");
        }
    }
}