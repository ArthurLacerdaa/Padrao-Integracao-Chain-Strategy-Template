package padroescomportamentais.integracao;

public class TipoRecursoAnulacao implements TipoRecurso {

    private static TipoRecursoAnulacao tipoRecursoAnulacao = new TipoRecursoAnulacao();

    private TipoRecursoAnulacao() {};
    
    public static TipoRecursoAnulacao getTipoRecursoAnulacao() {
        return tipoRecursoAnulacao;
    }

}
