package gerenciamentoescolar;

public class Main {

    public static void main(String[] args) {

        Professor professor =
                new Professor(
                        "Renato Abreu",
                        "123",
                        40,
                        "Mestre em Computação",
                        8000
                );

        Turma turma =
                new Turma(
                        "POO-2024.2",
                        "Programação Orientada a Objetos",
                        professor
                );

        Aluno aluno1 =
                new Aluno(
                        "Ana",
                        "111",
                        20,
                        "2024001",
                        8.5
                );

        Aluno aluno2 =
                new Aluno(
                        "Carlos",
                        "222",
                        21,
                        "2024002",
                        6.0
                );

        Aluno aluno3 =
                new Aluno(
                        "Marina",
                        "333",
                        22,
                        "2024003",
                        7.8
                );

        Aluno aluno4 =
                new Aluno(
                        "João",
                        "444",
                        19,
                        "2024004",
                        5.5
                );

        Aluno aluno5 =
                new Aluno(
                        "Lucas",
                        "555",
                        20,
                        "2024005",
                        8.7
                );

        turma.matricular(aluno1);
        turma.matricular(aluno2);
        turma.matricular(aluno3);
        turma.matricular(aluno4);
        turma.matricular(aluno5);

        turma.listarTurma();

        System.out.println();

        System.out.printf(
                "Média da turma: %.2f%n",
                turma.calcularMediaTurma()
        );

        System.out.println(
                "Aprovados: "
                        + turma.contarAprovados()
        );
    }
}