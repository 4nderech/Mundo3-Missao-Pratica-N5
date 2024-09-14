package cadastroserver.model;

import cadastroserver.model.Pessoa;
import cadastroserver.model.Produto;
import cadastroserver.model.Usuario;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-13T23:09:26", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Movimento.class)
public class Movimento_ { 

    public static volatile SingularAttribute<Movimento, Integer> idMovimento;
    public static volatile SingularAttribute<Movimento, Pessoa> idPessoa;
    public static volatile SingularAttribute<Movimento, Character> tipo;
    public static volatile SingularAttribute<Movimento, Produto> idProduto;
    public static volatile SingularAttribute<Movimento, Usuario> idUsuario;
    public static volatile SingularAttribute<Movimento, Integer> quantidade;
    public static volatile SingularAttribute<Movimento, BigDecimal> valorUnitario;

}