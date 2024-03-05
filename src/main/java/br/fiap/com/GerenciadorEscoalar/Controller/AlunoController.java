package br.fiap.com.GerenciadorEscoalar.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.fiap.com.GerenciadorEscoalar.Model.Aluno;






@RestController
@RequestMapping("Aluno")
public class AlunoController {
List <Aluno> Repository =  new ArrayList<>();


    @GetMapping()
    public List<Aluno> index(){
        return Repository;
    }
    
    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public Aluno AdicionarAluno(@RequestBody Aluno aluno) {
        System.out.println("esta indo");
        Repository.add(aluno);
        return aluno;
    }

    @GetMapping("{rm}")
    public Aluno AlunoPorRM(@PathVariable Long rm) {
        System.out.println("Rm é  {}"+ rm);
    }
    
    

    
}
