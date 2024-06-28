public class GastoCombustivel {

    public static void main(String[] args) {
        //entrada/dados para o programa;
        short distancia = 350;
        byte autonomia = 12;
        double valorCombustivel = 5.49;
        String nomeDoCarro = "Monza";

        //cálculo/processamento dos dados;
        int quantidadeCombustivel = distancia / autonomia;
        double valorGastoReais = valorCombustivel * quantidadeCombustivel;

        //dados mostrados para o usuário/saída (interface);
        System.out.println("-----------------------------------------------");
        System.out.println("             CONSUMO DO COMBUSTIVEL            ");
        System.out.println("-----------------------------------------------");
        System.out.println("Modelo do Carro: " + nomeDoCarro);
        System.out.println("Autonomia do Carro: " + autonomia + "km/l");
        System.out.println("Distância da Viagem: " + distancia + "km");
        System.out.println("Preço do combustível: " + valorCombustivel);
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("                  RESULTADO                    ");
        System.out.println("-----------------------------------------------");
        System.out.println("Modelo do carro: " + nomeDoCarro);
        System.out.println("Autonomia do Carro: " + autonomia + "km/l");
        System.out.println("Distância da Viagem: " + distancia + "km");
        System.out.println("Preço do combustível: " + valorCombustivel);
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("Quantidade do combustível gasto utilizado: R$" + quantidadeCombustivel + "l");
        System.out.println("Total gasto com a viagem: R$" + valorGastoReais);
        System.out.println("------------------------------------------------");

    }
}
