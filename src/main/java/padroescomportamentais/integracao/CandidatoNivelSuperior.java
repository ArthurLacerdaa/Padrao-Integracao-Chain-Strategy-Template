package padroescomportamentais.integracao;

public class CandidatoNivelSuperior extends Candidato {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 7.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    @Override
    public String getTipo() {
        return "CandidatoSuperior";
    }
}
