package com.convidados.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ConvidadosController {
    @GetMapping("/convidados")
    public ModelAndView listar(){
        ModelAndView mv = new ModelAndView("Lista Convidados");
        mv.addObject(new Convidado());
        mv.addObject("Convidados", convidadosRepository.findAll());

        return ;
    }

}
