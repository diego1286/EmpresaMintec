package com.empresamintic.empresamintic.models;


import javax.persistence.*;
import java.io.Serializable;



@Entity
@Table(name= "empresa")
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="nombre",length = 50)
    private  String nombre;

    @Column(name="dirección",length = 50)
    private String dirección;

    @Column(name= "telefono", length = 50)
    private String teléfono;

    @Column(name="nit", length = 50)
    private String NIT;


        /*
    @JoinColumn(name = "factura_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Factura facturas;*/

    /* Pregunta profe
    profe buen dia para crear las entidades es necesario crear
    la bd en pgAdmin o se puede utilizar create-drop
     */



    public Empresa(Long id, String nombre, String dirección, String teléfono, String NIT) {
        this.id = id;
        this.nombre = nombre;
        this.dirección = dirección;
        this.teléfono = teléfono;
        this.NIT = NIT;
    }

    public Empresa() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }


}