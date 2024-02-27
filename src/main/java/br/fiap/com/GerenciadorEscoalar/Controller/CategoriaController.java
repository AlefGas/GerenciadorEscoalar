package br.fiap.com.GerenciadorEscoalar.Controller;

import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CategoriaController {
    @RequestMapping(method = RequestMethod.GET, path = "/Categoria", produces = "application/json")
    @ResponseBody
    public String index(){
        return """
                [
                    {
                        "id":1,
                        "nome":'Alimentação',
                        "icone":"fast-food"
                    }
                ]
                """;
    }
    
}
