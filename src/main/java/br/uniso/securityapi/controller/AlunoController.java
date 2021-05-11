package br.uniso.securityapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlunoController {

    @GetMapping("/alunos")
    public List<String> listarAlunos(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Cocenço");
        lista.add("Carnelos");
        lista.add("Biel Henry");
        lista.add("Almagro");
        lista.add("Doki");
        lista.add("Evangelista");
        return lista;
    }

    @GetMapping("/profes")
    public List<String> listarProfes(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Falavinha");
        lista.add("Amauri");
        lista.add("Garcia");
        lista.add("Eloá");
        lista.add("Will");
        return lista;
    }

}
