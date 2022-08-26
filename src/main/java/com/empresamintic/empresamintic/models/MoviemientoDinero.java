package com.empresamintic.empresamintic.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "movimientos")
public class MoviemientoDinero implements Serializable {



    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="monto",length = 50)
    private  Long monto;

    @Column(name="concepto",length = 50)
    private String concepto;

    // asociacion en codigo relacion de uno a muchos en este sentido a empleaddo
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Empleado usuario;

    public MoviemientoDinero() {
    }

    public MoviemientoDinero(Long id, Long monto, String concepto, Empleado usuario) {
        this.id = id;
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public Long getMonto() {
        return monto;
    }

    public void setMonto(Long monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }


}
