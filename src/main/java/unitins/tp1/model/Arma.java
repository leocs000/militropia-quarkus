package unitins.tp1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "arma")
public class Arma extends Produto{
    @ManyToOne
    @JoinColumn(name="id_tipoArma")
    private TipoArma tipoArma;
    
    @ManyToOne
    @JoinColumn(name = "id_acabamento")
    private Acabamento acabamento;
    
    @Column
    private int capacidadeDeTiro;
    
    @Column
    private String propulsor;

    @Column
    private String velocidade;

    @ManyToOne
    @JoinColumn(name = "id_tipoTiro")
    private TipoTiro tipoTiro;

    @Column
    private String nomeImagem;

    // @ManyToOne
    // @JoinColumn(name = "id_municao")
    // private Municao tipoMunicao;

    

}
