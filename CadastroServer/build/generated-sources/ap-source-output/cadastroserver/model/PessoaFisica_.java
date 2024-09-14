package cadastroserver.model;

import cadastroserver.model.Pessoa;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-13T23:09:26", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(PessoaFisica.class)
public class PessoaFisica_ { 

    public static volatile SingularAttribute<PessoaFisica, Integer> idPessoa;
    public static volatile SingularAttribute<PessoaFisica, Pessoa> pessoa;
    public static volatile SingularAttribute<PessoaFisica, String> cpf;

}