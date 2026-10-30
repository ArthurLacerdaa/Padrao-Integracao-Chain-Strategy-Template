package padroescomportamentais.integracao;

public class CandidatoNivelMedio extends Candidato {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 6.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

}
