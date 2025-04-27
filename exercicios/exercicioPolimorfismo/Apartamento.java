package exercicios.exercicioPolimorfismo;

public class Apartamento extends Imovel {
    private double valorCondominio;

    public Apartamento(double valorDeVenda, String endereco, int anoConstrucao, String proprietario, double valorCondominio) {
        super(valorDeVenda, endereco, anoConstrucao, proprietario);
        this.valorCondominio = valorCondominio;
    }

    @Override
    public double calcularAluguel() {
        double aluguel = valorDeVenda * 0.004;
        int anos = 2025 - anoDeConstrucao;
        double desconto = Math.min(((double) anos / 5) * 0.05, 0.30);
        aluguel *= (1 - desconto);

        for (Beneficio beneficio : beneficios) {
            aluguel += beneficio.getValor();
        }

        aluguel += valorCondominio; 
        return aluguel;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }
}
