package com.empresamintic.empresamintic.repository;

import com.empresamintic.empresamintic.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Se debe anotar como repositorio para que sepa el el ide
public interface IEmpresaRepository extends JpaRepository <Empresa, Long  > {// en los
    // repos se pasa la entidad y la lleve primaria de esa entidad en este caso Empresa como entidad y Longo como llave primaria  long


}
