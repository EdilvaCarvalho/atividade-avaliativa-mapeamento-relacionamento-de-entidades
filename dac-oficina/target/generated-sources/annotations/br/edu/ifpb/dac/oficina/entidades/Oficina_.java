package br.edu.ifpb.dac.oficina.entidades;

import br.edu.ifpb.dac.oficina.entidades.Endereco;
import br.edu.ifpb.dac.oficina.entidades.Funcionario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-03T11:04:14")
@StaticMetamodel(Oficina.class)
public class Oficina_ { 

    public static volatile SingularAttribute<Oficina, Endereco> localizacao;
    public static volatile SingularAttribute<Oficina, Long> id;
    public static volatile SingularAttribute<Oficina, Double> saldo;
    public static volatile ListAttribute<Oficina, Funcionario> funcionarios;
    public static volatile SingularAttribute<Oficina, String> descricao;

}