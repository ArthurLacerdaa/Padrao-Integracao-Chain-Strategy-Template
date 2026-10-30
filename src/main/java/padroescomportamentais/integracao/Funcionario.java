package padroescomportamentais.integracao;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaRecursos = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String analisarRecurso(Recurso recurso) {
        if (listaRecursos.contains(recurso.getTipoRecurso())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.analisarRecurso(recurso);
            }
            else
            {
                return "Sem análise";
            }
        }
    }
}
