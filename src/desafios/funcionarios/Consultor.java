package desafios.funcionarios;

public class Consultor extends Funcionario {
    private double valorHora;
    private long horasTrabalhadas;

    public Consultor(String nome, long cpf, double valorHora, long horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
}
