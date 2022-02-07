package br.com.guithomas.springbootmysql.Controller;

import br.com.guithomas.springbootmysql.Controller.dto.PessoaRs;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoa")

public class PessoaController {

    public List<PessoaRs> findAll() {
        return null;


    }
}
