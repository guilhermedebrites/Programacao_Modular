package exercicios.exercicioPolimorfismo;

import java.util.ArrayList;
import java.util.List;

abstract class Imovel {
    protected double valorDeVenda;
    protected String endereco;
    protected int anoDeConstrucao;
    protected String proprietario;
    protected List<Beneficio> beneficios = new ArrayList<>();

    public Imovel(double valorDeVenda, String endereco, int anoDeConstrucao, String proprietario) {
        this.valorDeVenda = valorDeVenda;
        this.endereco = endereco;
        this.anoDeConstrucao = anoDeConstrucao;
        this.proprietario = proprietario;
    }

    public abstract double calcularAluguel();

    public int getAnoDeConstrucao() {
        return anoDeConstrucao;
    }

    public void adicionarBeneficio(Beneficio beneficio) {
        beneficios.add(beneficio);
    }

    public String getProprietario() {
        return proprietario;
    }
    
    public String getEndereco() {
        return endereco;
    }
}
