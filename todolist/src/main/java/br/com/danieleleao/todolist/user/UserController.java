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
    System.out.println(userModel.getUsername());
  }
  
}

//API dog é uma ferramenta para criar as nossas requisições

//maven tem a função no desenvolvimento da aplicação de gerenciar as dependências e fazer o build. O Maven é uma ferramenta de automação de compilação e gerenciamento de projetos que facilita a gestão de dependências de bibliotecas e a construção de um projeto, além de fornecer um ambiente consistente para o desenvolvimento de aplicativos. Isso inclui a resolução de dependências, compilação, empacotamento e distribuição de um projeto de software. 

/**As classes em java precisam estar dentreo de um pacote (package)
As importações são todas as interfaces ou classes que podem reutilizar dentro das classes que estamos utilizando
No vscode o pacote é de uma cor e a classe é de outra
Classe, os códigos precisam 

@ - anotation - é uma função que o springboot consegue identificar
método main em java é um método principal que conseguimos executar alguma coisa em java
Controller - camada entre a requisição e as demais camadas (quem recebe a requisição do usuário)
@Controller - retornar páginas, templates
@RestController - construindo uma API

Spring vai generenciando recursivamente

dentro de User usaremos todas as regras de negócio e tudo o que se relacionar ao usuário
O nome da classe vai ser o mesmo nome do arquivo 

 O empacotamento via WAR requer um servidor para rodar a aplicação, enquanto o empacotamento via JAR não.
 
 Um controller é um componente fundamental em muitos frameworks de desenvolvimento web, incluindo o Spring MVC (Model-View-Controller), que ajuda a gerenciar o fluxo de uma aplicação web e a lidar com solicitações HTTP vindas dos clientes.

 Private: Este modificador é o mais restrito. Com ele definimos que somente a própria classe em que um atributo ou método foi declarado pode acessá-lo. Ou seja, nenhuma outra parte do código, nem mesmo as classes filhas, pode acessar esse atributo ou método.
 */