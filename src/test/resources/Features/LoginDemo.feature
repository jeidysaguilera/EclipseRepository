Feature: Test de la Pantalla de Login

  
  Scenario Outline: Chequear que se loguee la pagina correctamente
    
    Given se abre la pantalla de loguearse
    When el usuario entra su "<username>" y "<password>" correctamente
    And se autentica al dar clic en Login
    Then el usuario entra a la Pagina Principal

    Examples: 
      | username | password             |
      | tomsmith | SuperSecretPassword! |
      | tomsmith | SuperSecretPassword! |
