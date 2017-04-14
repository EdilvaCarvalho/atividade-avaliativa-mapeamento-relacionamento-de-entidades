package br.edu.ifpb.dac.oficina.entidades;

import br.edu.ifpb.dac.oficina.entidades.Funcionario;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-03T11:04:14")
@StaticMetamodel(Conserto.class)
public class Conserto_ { 

    public static volatile SingularAttribute<Conserto, LocalDate> realizadoEm;
    public static volatile SingularAttribute<Conserto, Double> valor;
    public static volatile SingularAttribute<Conserto, Long> id;
    public static volatile SingularAttribute<Conserto, Funcionario> funcionario;

}