package br.com.danieleleao.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //vou criar uma rota, um path
//Http://localhost:8080/ ----------- (aqui vai toda a rota que criamos na nossa aplicação)
@RequestMapping("/primeiraRota") //responsável por informar a rota
public class MinhaPrimeiraController {

/**
 * Quando construímos uma API com consceitos de spring, temos uma classe, dentro dela temos o método do java, o tipo modificador desse método (ex: public/write), qual o tipo de retorno que esse método vai retornar para nós, o nome do método e quais são os parâmetros que poderemos receber dentro da minha requisição.
 * 
 * Pra retornar essa mensagem (uma informação dentro dessa API), precisamos passar para o browser um path (aqui na arquietura Rest, métodos de acesso/requisição HTTP): 
 * GET - buscar uma informação
 * POST - adicionar uma info/dado 
 * PUT - alterar uma info/dado Ex: alterar username, senha, e-mail, etc.
 * DELETE - remover uma info/dado
 * PATCH - alterar somente uma parte da informação/dado. Ex: só alterar o username
 *  
 * TomCast na porta 8080*/
 
@GetMapping("/primeiroMetodo")
 //Método/funcionalidade de uma classe
  public String primeiraMensagem() {
    return "Funcionou"; /**retornando uma mensagem */
  }
}
