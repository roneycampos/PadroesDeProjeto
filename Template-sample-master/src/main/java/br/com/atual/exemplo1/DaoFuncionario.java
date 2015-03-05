package br.com.atual.exemplo1;

public class DaoFuncionario extends Dao {

    @Override
    protected Boolean valida(IBean entidade) {

        Funcionario func = (Funcionario) entidade;

        if (func.getCargo() != null) {
            return true;
        }
        return false;
    }
}
