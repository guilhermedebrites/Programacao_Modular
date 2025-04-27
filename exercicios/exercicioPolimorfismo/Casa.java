package exercicios.exercicioPolimorfismo;

public class Casa extends Imovel {

    public Casa(double valorDeVenda, String endereco, int anoConstrucao, String proprietario) {
        super(valorDeVenda, endereco, anoConstrucao, proprietario);
    }

    @Override
    public double calcularAluguel() {
        double aluguel = valorDeVenda * 0.005;
        int anos = 2025 - anoDeConstrucao;
        double desconto = Math.min(((double) anos / 5) * 0.10, 0.30);
        aluguel *= (1 - desconto);

        for (Beneficio beneficio : beneficios) {
            aluguel += beneficio.getValor();
        }
        return aluguel;
    }
}
