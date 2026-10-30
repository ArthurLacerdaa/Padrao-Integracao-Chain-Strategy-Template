package padroescomportamentais.integracao;

public class TipoRecursoNota implements TipoRecurso {

    private static TipoRecursoNota tipoRecursoNota = new TipoRecursoNota();

    private TipoRecursoNota() {};
    
    public static TipoRecursoNota getTipoRecursoNota() {
        return tipoRecursoNota;
    }

}
