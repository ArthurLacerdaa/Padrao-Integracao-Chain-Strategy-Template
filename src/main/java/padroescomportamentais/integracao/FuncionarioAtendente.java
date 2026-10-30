package padroescomportamentais.integracao;

public class FuncionarioAtendente extends Funcionario {
    
    public FuncionarioAtendente(Funcionario superior) {
        listaRecursos.add(TipoRecursoInscricao.getTipoRecursoInscricao());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Atendente";
    }

}
