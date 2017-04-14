package br.edu.ifpb.dac.sistemaBancario.entidades;

import br.edu.ifpb.dac.sistemaBancario.entidades.Agencia;
import br.edu.ifpb.dac.sistemaBancario.entidades.Cliente;
import br.edu.ifpb.dac.sistemaBancario.entidades.TipoConta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-11T20:55:27")
@StaticMetamodel(Conta.class)
public class Conta_ { 

    public static volatile SingularAttribute<Conta, Long> numero_conta;
    public static volatile SingularAttribute<Conta, String> senha;
    public static volatile SingularAttribute<Conta, Cliente> dono;
    public static volatile SingularAttribute<Conta, Long> codico;
    public static volatile SingularAttribute<Conta, Double> saldo;
    public static volatile SingularAttribute<Conta, Integer> digito_conta;
    public static volatile SingularAttribute<Conta, Agencia> agencia;
    public static volatile SingularAttribute<Conta, TipoConta> tipoConta;

}