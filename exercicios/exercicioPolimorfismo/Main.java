package exercicios.exercicioPolimorfismo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Imobiliaria imobiliaria = new Imobiliaria();

        // Criando Casa
        Casa casa = new Casa(500000, "Rua A, 123", 2010, "João");
        casa.adicionarBeneficio(new Beneficio("Piscina", 500));
        casa.adicionarBeneficio(new Beneficio("Área de lazer", 300));

        // Criando Apartamento
        Apartamento ap = new Apartamento(300000, "Av B, 456", 2015, "Maria", 400);
        ap.adicionarBeneficio(new Beneficio("Elevador", 200));

        // Adicionando imóveis à imobiliária
        imobiliaria.adicionarImovel(casa);
        imobiliaria.adicionarImovel(ap);

        // Mostrando resumo dos proprietários
        imobiliaria.mostrarResumoProprietario("João");
        imobiliaria.mostrarResumoProprietario("Maria");

        // Buscar imóveis pelo ano de construção
        List<Imovel> imoveis2015 = imobiliaria.buscarPorAno(2015);
        for (Imovel imovel : imoveis2015) {
            System.out.println("Imóvel encontrado, ano de construção(2015): " + imovel.getEndereco() +
                    ", Proprietário: " + imovel.getProprietario() +
                    ", Aluguel: R$ " + imovel.calcularAluguel());
        }

        // Aqui começa a parte para testar o valor recebido pela imobiliária
        System.out.println("\n--- Valores a receber pela Imobiliária ---");
        for (Imovel imovel : List.of(casa, ap)) {
            double valorRecebido = imobiliaria.calcularValorRecebido(imovel);
            System.out.println("Imóvel: " + imovel.getEndereco());
            System.out.println("Valor recebido pela imobiliária: R$ " + String.format("%.2f", valorRecebido));
            System.out.println();
        }
    }
}
