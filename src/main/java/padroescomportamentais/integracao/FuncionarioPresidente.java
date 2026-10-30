package padroescomportamentais.integracao;

public class FuncionarioPresidente extends Funcionario {
    
    public FuncionarioPresidente(Funcionario superior) {
        listaRecursos.add(TipoRecursoAnulacao.getTipoRecursoAnulacao());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Presidente";
    }

}
