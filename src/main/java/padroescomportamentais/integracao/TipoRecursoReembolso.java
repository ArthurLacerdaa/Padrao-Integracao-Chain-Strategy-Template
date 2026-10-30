package padroescomportamentais.integracao;

public class TipoRecursoReembolso implements TipoRecurso {

    private static TipoRecursoReembolso tipoRecursoReembolso = new TipoRecursoReembolso();

    private TipoRecursoReembolso() {};
    
    public static TipoRecursoReembolso getTipoRecursoReembolso() {
        return tipoRecursoReembolso;
    }

}
