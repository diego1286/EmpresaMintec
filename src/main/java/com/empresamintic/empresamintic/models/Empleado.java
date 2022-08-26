package com.empresamintic.empresamintic.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "empleado")
public class Empleado implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="nombre",length = 50)
    private  String nombre;

    @Column(name="correo",length = 50)
    private String correo;

    // asociacion en codigo relacion de uno a muchos
    @ManyToOne
    @JoinColumn(name="empresa_id")
    private Empresa empresa;

    @Column(name="rol", length = 50)
    private String rol;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String correo, Empresa empresa, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
