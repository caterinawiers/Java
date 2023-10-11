package br.com.danieleleao.todolist.user;

import lombok.Data;
@Data
public class UserModel {

  private String username;
  private String name;
  private String password;
}
  /**utilizei set.username e o vscode tem o auto complete abaixo:
  //ele cria um método que nao retorna nada "void" e passa um atributo username - inserir o valor
  public void setUsername(String username) {
    this.username = username;
  }
//para buscar o valor getUsername e com o auto complete abaixo:
  public String getUsername() {
    return username;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }
}

/**quando definimos os atributos de uma classe como private, precisamos informar outras maneiras para que esses atruibutos pssam ser acessados por outras classes:
 * para acessar o atributo, podemos utilizar um método get para acessá-lo e recuperá-lo - getters
 * setters - para inserir ou atualizar o valor de um atributo
 * 
 * removo todos os getters e os setters após o lombok nas dependencias
  */