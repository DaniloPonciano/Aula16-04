package com.convidados.controller;

import com.convidados.model.Convidados;
import com.convidados.repository.ConvidadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvidadosController {
    @Autowired
    private ConvidadosRepository convidadosRepository;

    @GetMapping("/convidados")
    public ModelAndView listar(){
        ModelAndView mv = new ModelAndView("Lista Convidados");
        mv.addObject(new Convidados());
        mv.addObject("Convidados", convidadosRepository.findAll());

        return mv;
    }

    @PostMapping("/convidados")
    public String salvar(Convidados convidados){
        this.convidadosRepository.save(convidados);

    }

}
