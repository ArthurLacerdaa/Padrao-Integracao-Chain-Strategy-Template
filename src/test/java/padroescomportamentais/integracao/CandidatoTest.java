package padroescomportamentais.integracao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandidatoTest {

    FuncionarioPresidente presidente;
    FuncionarioComissao comissao;
    FuncionarioBanca banca;
    FuncionarioAtendente atendente;

    @BeforeEach
    void setUp() {
        presidente = new FuncionarioPresidente(null);
        comissao = new FuncionarioComissao(presidente);
        banca = new FuncionarioBanca(comissao);
        atendente = new FuncionarioAtendente(banca);
    }

    @Test
    void deveCalcularMediaCandidato() {
        CandidatoNivelMedio candidato = new CandidatoNivelMedio();
        candidato.setNota1(7.0f);
        candidato.setNota2(8.0f);
        assertEquals(7.5f, candidato.calcularMedia());
    }

    @Test
    void deveCalcularNotaTotalCandidato() {
        CandidatoNivelMedio candidato = new CandidatoNivelMedio();
        candidato.setNota1(7.0f);
        candidato.setNota2(8.0f);
        assertEquals(15.0f, candidato.calcularNotaTotal());
    }

    @Test
    void deveRetonarAprovadoNivelMedio() {
        CandidatoNivelMedio candidato = new CandidatoNivelMedio();
        candidato.setNota1(6.0f);
        candidato.setNota2(6.0f);
        assertEquals("Aprovado", candidato.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovadoNivelMedio() {
        CandidatoNivelMedio candidato = new CandidatoNivelMedio();
        candidato.setNota1(6.0f);
        candidato.setNota2(5.9f);
        assertEquals("Reprovado", candidato.verificarAprovacao());
    }

    @Test
    void deveRetonarAprovadoNivelSuperior() {
        CandidatoNivelSuperior candidato = new CandidatoNivelSuperior();
        candidato.setNota1(7.0f);
        candidato.setNota2(7.0f);
        assertEquals("Aprovado", candidato.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovadoNivelSuperior() {
        CandidatoNivelSuperior candidato = new CandidatoNivelSuperior();
        candidato.setNota1(7.0f);
        candidato.setNota2(6.9f);
        assertEquals("Reprovado", candidato.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoesNivelMedio() {
        CandidatoNivelMedio candidato = new CandidatoNivelMedio();
        candidato.setNota1(6.0f);
        candidato.setNota2(5.9f);
        candidato.setNome("Ana");
        candidato.setInscricao(2);
        assertEquals("Candidato{inscricao=2, nome='Ana', resultado=Reprovado}", candidato.getInfo());
    }

    @Test
    void deveRetornarInformacoesNivelSuperior() {
        CandidatoNivelSuperior candidato = new CandidatoNivelSuperior();
        candidato.setNota1(7.0f);
        candidato.setNota2(7.0f);
        candidato.setNome("Bruno");
        candidato.setInscricao(1);
        assertEquals("CandidatoSuperior{inscricao=1, nome='Bruno', resultado=Aprovado}", candidato.getInfo());
    }

    @Test
    void deveRetornarAtendenteParaRecursoInscricao() {
        CandidatoNivelMedio candidato = new CandidatoNivelMedio();
        assertEquals("Atendente", candidato.solicitarRecurso(atendente, TipoRecursoInscricao.getTipoRecursoInscricao()));
    }

    @Test
    void deveRetornarBancaParaRecursoGabarito() {
        CandidatoNivelMedio candidato = new CandidatoNivelMedio();
        assertEquals("Banca", candidato.solicitarRecurso(atendente, TipoRecursoGabarito.getTipoRecursoGabarito()));
    }

    @Test
    void deveRetornarComissaoParaRecursoNota() {
        CandidatoNivelSuperior candidato = new CandidatoNivelSuperior();
        assertEquals("Comissao", candidato.solicitarRecurso(atendente, TipoRecursoNota.getTipoRecursoNota()));
    }

    @Test
    void deveRetornarPresidenteParaRecursoAnulacao() {
        CandidatoNivelSuperior candidato = new CandidatoNivelSuperior();
        assertEquals("Presidente", candidato.solicitarRecurso(atendente, TipoRecursoAnulacao.getTipoRecursoAnulacao()));
    }

    @Test
    void deveRetornarSemAnaliseParaRecursoReembolso() {
        CandidatoNivelSuperior candidato = new CandidatoNivelSuperior();
        assertEquals("Sem análise", candidato.solicitarRecurso(atendente, TipoRecursoReembolso.getTipoRecursoReembolso()));
    }

}
