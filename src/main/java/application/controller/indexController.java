package application.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class indexController {
    //@RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/mensagem")
    public String mensagem (@RequestParam int opcao, Model ui) {
        String texto = "";
        switch (opcao) {
            case 1:
                texto = "bom dia!";
                break;
            case 2:
                texto = "boa tarde!";
                break;
            case 3:
                texto = "boa noite!";
                break;
            default:
                texto = "olá";
                break;
        }
        ui.addAttribute("texto", texto);
        return "mensagem";
    }
}
