package br.com.atual.exemplo1;

/**
 * Created by Ton on 04/03/2015.
 */
public class Inicio {


    public static void main(String[] args) {
        System.out.println("Teste salvando");

        DaoPessoaFisica dao = new DaoPessoaFisica();
        PessoaFisica pf = new PessoaFisica();
        pf.setId(0);
        pf.setNome("Ana");
        pf.setCpf("04251217985");
        dao.salvar(pf);


        DaoCliente daoCliente = new DaoCliente();
        Cliente cliente = new Cliente();
        cliente.setId(0);
        cliente.setNome("Cliente legal");
        cliente.setNumeroCliente(123);

        daoCliente.salvar(cliente);
        
        DaoFuncionario Funcionario = new DaoFuncionario();
        
        Funcionario funcionario = new Funcionario();
        
        funcionario.setId(0);
        funcionario.setNome("Roney");
        funcionario.setCargo("Programador");

    }

}
