package br.com.atual.exemplo1;

public class Funcionario extends Entidade implements IBean{
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
