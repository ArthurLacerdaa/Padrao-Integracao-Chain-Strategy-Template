package padroescomportamentais.integracao;

public class TipoRecursoGabarito implements TipoRecurso {

    private static TipoRecursoGabarito tipoRecursoGabarito = new TipoRecursoGabarito();

    private TipoRecursoGabarito() {};
    
    public static TipoRecursoGabarito getTipoRecursoGabarito() {
        return tipoRecursoGabarito;
    }

}
