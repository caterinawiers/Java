package br.com.danieleleao.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificadores:
 * - tipos de acesso -
 * public - público
 * private - uma restrição um pouco maior/somente alguns atributos permitidos
 * protected - mesma estrutura do pacote que tem acesso
 */
@RestController
@RequestMapping("/users")
public class UserController {

  /**
   * string - texto
   * integer (int) - números inteiros
   * double - números com casas decimais
   * float - número de caracteres que terã0 0.000
   * char (A C) - caracteres
   * date - data
   * void - não temos retorno do nosso método. Só quando queremos que uma lógica seja executada dentro do nosso método
   */
//Body - as infos da usuário vão vir dentro do bodu da requisição
@PostMapping("/")
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userMordel.name);
  }
  
}
