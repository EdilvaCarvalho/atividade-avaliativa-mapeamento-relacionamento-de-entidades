
package App;

import br.edu.ifpb.dac.sistemaBancario.dao.ClienteDao;
import br.edu.ifpb.dac.sistemaBancario.dao.ClienteDaoBD;
import br.edu.ifpb.dac.sistemaBancario.dao.ContaDao;
import br.edu.ifpb.dac.sistemaBancario.dao.ContaDaoBD;
import br.edu.ifpb.dac.sistemaBancario.entidades.Agencia;
import br.edu.ifpb.dac.sistemaBancario.entidades.Cliente;
import br.edu.ifpb.dac.sistemaBancario.entidades.Conta;
import br.edu.ifpb.dac.sistemaBancario.entidades.Endereco;
import br.edu.ifpb.dac.sistemaBancario.entidades.TipoConta;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Edilva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Timbaúba", "São João do Rio do Peixe");
        Cliente cliente = new Cliente("Edilva Carvalho", "111.111.111-11", "123456", "edilva@gmail.com", 
                "1234", "(83) 99999-9999", LocalDate.of(1995, Month.SEPTEMBER, 11), endereco);
        
        ClienteDao clienteDao = new ClienteDaoBD();
        
        
        Agencia agencia = new Agencia(4, 1449);
        Conta conta = new Conta(agencia, 11223, 7, 100, "3444", TipoConta.POUPANCA);
        cliente.setConta(conta);
        
        clienteDao.salvar(cliente);

        Cliente c = clienteDao.autenticar("edilva@gmail.com", "1234");
        System.out.println(c.toString());

    }
    
}
