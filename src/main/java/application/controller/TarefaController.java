package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import application.repository.TarefaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import application.model.Tarefa;

@Controller
@RequestMapping("/tarefas")
public class TarefaController{
    @Autowired
    private TarefaRepository tarefaRepo;

    @RequestMapping("/list")
    public String select(Model ui){
        ui.addAttribute("tarefas", tarefaRepo.findAll());
        return "list";
    }

    @RequestMapping("/insert")
    public String insert(){
        return "formInsert";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestParam("descricao") String descricao){
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao(descricao);

        tarefaRepo.save(tarefa);

        return "formInsert";
    }
}