package gerenciamentoescolar;

public class Professor extends Pessoa {

    private String formacao;
    private double salario;

    public Professor(String nome,
                      String cpf,
                      int idade,
                      String formacao,
                      double salario) {

        super(nome, cpf, idade);

        this.formacao = formacao;
        this.salario = salario;
    }

    @Override
    public void exibirDados() {

        super.exibirDados();

        System.out.println("Formação: " + formacao);

        System.out.printf("Salário: %.2f%n", salario);
    }
}