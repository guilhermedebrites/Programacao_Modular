package exercicios.exercicioPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private List<Imovel> imoveis = new ArrayList<>();

    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public List<Imovel> buscarPorAno(int ano) {
        List<Imovel> encontrados = new ArrayList<>();
        for (Imovel imovel : imoveis) {
            if (imovel.getAnoDeConstrucao() == ano) {
                encontrados.add(imovel);
            }
        }
        return encontrados;
    }

    public double calcularValorRecebido(Imovel imovel) {
        double aluguelSemCondominio = imovel instanceof Apartamento
            ? imovel.calcularAluguel() - ((Apartamento) imovel).getValorCondominio()
            : imovel.calcularAluguel();
        return aluguelSemCondominio * 0.12;
    }

    public void mostrarResumoProprietario(String proprietario) {
        double valorBruto = 0;
        double valorLiquido = 0;
        for (Imovel imovel : imoveis) {
            if (imovel.getProprietario().equals(proprietario)) {
                double aluguel = imovel.calcularAluguel();
                double recebidoImobiliaria = calcularValorRecebido(imovel);
                double aluguelSemCondominio = imovel instanceof Apartamento
                    ? aluguel - ((Apartamento) imovel).getValorCondominio()
                    : aluguel;
                valorBruto += aluguel;
                valorLiquido += aluguelSemCondominio - recebidoImobiliaria;
            }
        }
        System.out.println("Proprietário: " + proprietario);
        System.out.println("Valor Bruto: R$ " + valorBruto);
        System.out.println("Valor Líquido: R$ " + valorLiquido);
    }
}
