package br.com.guithomas.springbootmysql.Controller;

import br.com.guithomas.springbootmysql.Controller.dto.PessoaRs;
import br.com.guithomas.springbootmysql.repository.PessoaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoa")

public class PessoaController {

    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<PessoaRs> findAll() {
        var pessoas = pessoaRepository.findAll();
        return null;


    }
}
