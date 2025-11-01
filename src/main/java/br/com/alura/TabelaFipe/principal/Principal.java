package br.com.alura.TabelaFipe.principal;

import br.com.alura.TabelaFipe.service.ConsumoApi;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";
    private ConsumoApi consumo = new ConsumoApi();

    public void exibeMenu(){
        var menu = """
                *** OPÇÕES ***
                Carro
                Moto
                Caminhão
                
                
                Digite uma das opções para conxultar:
                """;

        System.out.println(menu);
        var opcaoVeiculo = leitura.nextLine();
        String endereco;

        if (opcaoVeiculo.toLowerCase().contains("carr")){
            endereco = URL_BASE + "carros/marcas";
        } else if (opcaoVeiculo.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }


        var json = consumo.obterDados(endereco);
        System.out.println(json);

    }

}
