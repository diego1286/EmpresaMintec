package com.empresamintic.empresamintic.controller;


import com.empresamintic.empresamintic.models.Empresa;
import com.empresamintic.empresamintic.services.iface.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class EmpresaController {

    @GetMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }

/*
    @Autowired
    IEmpresaService iempresaService; // inyeccion de dependencias para poder implementar metodos

    @GetMapping ({"/empre","/VerEmpresas"})
    public String VerEmpresas(Model model) throws Exception {
        List<Empresa> listaEmpresas= iempresaService.getAllEmpresas();
        model.addAttribute("emplist",listaEmpresas);
        return "verEmpresas";

    }
/*
    @GetMapping("/EliminarEmpresa/{id}")
    public String eliminarEmpresa(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        try{
            empresaService.deleteEmpresa(id);

        }catch (Exception e){
            redirectAttributes.addFlashAttribute("mensaje","deleteError");
            return "redirect:/VerEmpresas";
        }
        redirectAttributes.addFlashAttribute("mensaje","deleteOK");
        return "redirect:/VerEmpresas";
    }
    */



}
