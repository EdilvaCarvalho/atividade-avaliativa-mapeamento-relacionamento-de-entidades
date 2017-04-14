
package br.edu.ifpb.dac.oficina.main;

import br.edu.ifpb.dac.oficina.dao.ConsertoDAO;
import br.edu.ifpb.dac.oficina.dao.FuncionarioDAO;
import br.edu.ifpb.dac.oficina.dao.OficinaDAO;
import br.edu.ifpb.dac.oficina.entidades.Conserto;
import br.edu.ifpb.dac.oficina.entidades.Endereco;
import br.edu.ifpb.dac.oficina.entidades.Funcao;
import br.edu.ifpb.dac.oficina.entidades.Funcionario;
import br.edu.ifpb.dac.oficina.entidades.Oficina;
import java.time.LocalDate;

/**
 *
 * @author Edilva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Endereco endereco = new Endereco("João Alves da Silva", "Jardim Oasis", "Cajazeiras");
        Oficina oficina = new Oficina("Oficina do Zé", endereco, 10000);
        OficinaDAO odao = new OficinaDAO();
        odao.salvar(oficina);
        Funcionario funcionario = new Funcionario("Edilva", "111.111.111-11", "222222", 3000, Funcao.GERENTE);
        FuncionarioDAO fdao = new FuncionarioDAO();
        fdao.salvar(funcionario);
        odao.addFuncionario(oficina, funcionario);
        Conserto conserto = new Conserto(300, LocalDate.now(), funcionario);
        ConsertoDAO cdao = new ConsertoDAO();
        cdao.salvar(conserto);
    }
    
}
