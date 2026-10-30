package padroescomportamentais.integracao;

public abstract class Candidato {

    private int inscricao;
    protected String nome;
    private float nota1;
    private float nota2;

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float calcularMedia() {
        Calculadora calculadora = new Calculadora(this.nota1, this.nota2);
        return calculadora.calcular(new OperacaoMedia());
    }

    public float calcularNotaTotal() {
        Calculadora calculadora = new Calculadora(this.nota1, this.nota2);
        return calculadora.calcular(new OperacaoSomar());
    }

    public abstract String verificarAprovacao();

    public String getTipo() {
        return "Candidato";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "inscricao=" + this.inscricao +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarAprovacao() +
                '}';
    }

    public String solicitarRecurso(Funcionario funcionario, TipoRecurso tipoRecurso) {
        return funcionario.analisarRecurso(new Recurso(tipoRecurso));
    }
}
