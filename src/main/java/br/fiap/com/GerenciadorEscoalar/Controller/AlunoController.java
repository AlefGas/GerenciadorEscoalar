package br.fiap.com.GerenciadorEscoalar.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlunoController {
    @RequestMapping(method = RequestMethod.GET, path = "/Aluno", produces = "application/json")
    @ResponseBody
    public String index(){
        return """
                [
                    {
                        "rm":0000000,
                        "nome":'Joao',
                        "turma": 'A'
                    }
                ]
                """;
    }
    

    
}
