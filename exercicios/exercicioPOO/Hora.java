package exercicios.exercicioPOO;

public class Hora {

    private int segundos; 
    private int minutos;
    private int horas;

    public Hora(int horas, int minutos, int segundos) {
        if (horaValida(horas, minutos, segundos)) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            throw new IllegalArgumentException("Hora inválida!");
        }
    }

    private boolean horaValida(int horas, int minutos, int segundos) {
        return (horas >= 0 && horas < 24) && (minutos >= 0 && minutos < 60) && (segundos >= 0 && segundos < 60);
    }

    public Hora incrementar(int h, int m, int s) {
        int novoSegundos = this.segundos + s;
        int novoMinutos = this.minutos + m + (novoSegundos / 60);
        int novaHora = this.horas + h + (novoMinutos / 60);
        
        novoSegundos %= 60;
        novoMinutos %= 60;
        novaHora %= 24;
        
        return new Hora(novaHora, novoMinutos, novoSegundos);
    }

    // Retorna um valor negativo se esta hora for anterior, zero se forem iguais, ou um valor positivo se esta hora for posterior.
    public int comparar(Hora outra) {
        if (this.horas != outra.horas) {
            return Integer.compare(this.horas, outra.horas);
        } else if (this.minutos != outra.minutos) {
            return Integer.compare(this.minutos, outra.minutos);
        } else {
            return Integer.compare(this.segundos, outra.segundos);
        }
    }

    public static void main(String[] args) {
        Hora hora1 = new Hora(14, 30, 45);
        Hora hora2 = hora1.incrementar(2, 35, 30);

        System.out.println("Hora original: " + hora1);
        System.out.println("Hora incrementada: " + hora2);
        
        int comparacao = hora1.comparar(hora2);
        if (comparacao < 0) {
            System.out.println("Hora1 está antes de Hora2");
        } else if (comparacao > 0) {
            System.out.println("Hora1 está depois de Hora2");
        } else {
            System.out.println("As horas são iguais");
        }
    }

}