package br.edu.ifpb.dac.sistemaBancario.entidades;

import br.edu.ifpb.dac.sistemaBancario.entidades.Conta;
import br.edu.ifpb.dac.sistemaBancario.entidades.Endereco;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-11T20:55:27")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> senha;
    public static volatile SingularAttribute<Cliente, Long> codigo;
    public static volatile SingularAttribute<Cliente, String> telefone;
    public static volatile SingularAttribute<Cliente, LocalDate> dataNasc;
    public static volatile SingularAttribute<Cliente, Endereco> endereco;
    public static volatile SingularAttribute<Cliente, String> rg;
    public static volatile SingularAttribute<Cliente, String> cpf;
    public static volatile SingularAttribute<Cliente, Conta> conta;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, String> email;

}