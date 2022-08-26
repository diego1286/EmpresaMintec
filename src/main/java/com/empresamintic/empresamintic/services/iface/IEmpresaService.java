package com.empresamintic.empresamintic.services.iface;

import com.empresamintic.empresamintic.models.Empresa;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IEmpresaService {

    // metodo que retorna las empresas de la lista
     List<Empresa> getAllEmpresas() throws Exception;

    public Empresa save(Empresa empresa) throws Exception;

    public Empresa findById(Long id) throws Exception;

}
