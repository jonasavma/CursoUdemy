package associacao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "pessoas")
public class Pessoa implements Serializable {

    @Id
    @SequenceGenerator(name = "generator_pessoa", sequenceName = "sequence_pessoa")
    @GeneratedValue(generator = "generator_pessoa")
    private Long id;

    @Column(name = "nome", length = 70, nullable = true)
    private String nome;

    @Column(name = "fone", length = 40, nullable = true)
    private String fone;

    @Column(name = "cidade", length = 20)
    private String cidade;

    @Column(precision = 2)
    private double salario;

    @Temporal(TemporalType.DATE)
    private Date dataCadastro;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @OneToOne
    @JoinColumn(name = "id_endereco_pessoa")
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


}
