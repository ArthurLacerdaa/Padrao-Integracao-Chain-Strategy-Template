package padroescomportamentais.integracao;

public class TipoRecursoInscricao implements TipoRecurso {

    private static TipoRecursoInscricao tipoRecursoInscricao = new TipoRecursoInscricao();

    private TipoRecursoInscricao() {};
    
    public static TipoRecursoInscricao getTipoRecursoInscricao() {
        return tipoRecursoInscricao;
    }

}
