package com.empresamintic.empresamintic.services.impl;

import com.empresamintic.empresamintic.models.Empresa;
import com.empresamintic.empresamintic.repository.IEmpresaRepository;
import com.empresamintic.empresamintic.services.iface.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService implements IEmpresaService{

 @Autowired
 private static IEmpresaRepository empresaRepository;// se hace la inyeccion de dependencias con esta linea


 @Override
 public List<Empresa> getAllEmpresas() throws Exception {
  List<Empresa> empresaList= new ArrayList<>();
  empresaRepository.findAll().forEach(empresa -> empresaList.add(empresa)); // se debe recccorer con el forech
  // lo que hace es iterar sobre la lista y se guarda

  return empresaList;
 }


 @Override
 public Empresa save(Empresa empresa) throws Exception {
  return  empresaRepository.save(empresa);

 }

 // metodo que trae un objeto por id
 @Override
 public Empresa findById(Long id) throws Exception {
  return  empresaRepository.findById(id).get();
 }







}
