package padroescomportamentais.integracao;

public class FuncionarioComissao extends Funcionario {
    
    public FuncionarioComissao(Funcionario superior) {
        listaRecursos.add(TipoRecursoNota.getTipoRecursoNota());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Comissao";
    }

}
