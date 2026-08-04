package gerenciamentoescolar;

public class Turma {

    private String codigo;
    private String disciplina;
    private Professor professor;

    private Aluno[] alunos;

    private int quantidade;

    public Turma(String codigo,
                 String disciplina,
                 Professor professor) {

        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;

        alunos = new Aluno[20];

        quantidade = 0;
    }

    public void matricular(Aluno a) {

        if (quantidade < 20) {

            alunos[quantidade] = a;

            quantidade++;

        } else {

            System.out.println("Turma lotada");
        }
    }

    public void listarTurma() {

        System.out.println("Turma: "
                + codigo + " - " + disciplina);

        System.out.println();

        System.out.println("Professor responsável:");

        professor.exibirDados();

        System.out.println();

        System.out.println("--- Alunos matriculados ---");

        for (int i = 0; i < quantidade; i++) {

            System.out.println();

            alunos[i].exibirDados();
        }
    }

    public double calcularMediaTurma() {

        if (quantidade == 0) {
            return 0;
        }

        double soma = 0;

        for (int i = 0; i < quantidade; i++) {

            soma += alunos[i].getMedia();
        }

        return soma / quantidade;
    }

    public int contarAprovados() {

        int aprovados = 0;

        for (int i = 0; i < quantidade; i++) {

            if (alunos[i].getMedia() >= 7.0) {

                aprovados++;
            }
        }

        return aprovados;
    }
}