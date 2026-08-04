package gerenciamentoescolar;

public class Aluno extends Pessoa {

    private String matricula;
    private double media;

    public Aluno(String nome,
                  String cpf,
                  int idade,
                  String matricula,
                  double media) {

        super(nome, cpf, idade);

        this.matricula = matricula;
        this.media = media;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public void exibirDados() {

        super.exibirDados();

        System.out.println("Matrícula: " + matricula);

        System.out.printf("Média: %.2f%n", media);

        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}