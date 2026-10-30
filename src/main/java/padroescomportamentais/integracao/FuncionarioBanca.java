package padroescomportamentais.integracao;

public class FuncionarioBanca extends Funcionario {
    
    public FuncionarioBanca(Funcionario superior) {
        listaRecursos.add(TipoRecursoGabarito.getTipoRecursoGabarito());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Banca";
    }

}
