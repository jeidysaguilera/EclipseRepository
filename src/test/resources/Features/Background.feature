Feature: Test de la Pantalla Principal

  Background: el usuario se encuentra en la pagina Principal
    Given el usuario esta en la pagina de Login
    When inserta username y password correctamente
    And clic en Login
    Then entra a la pagina Principal

  Scenario: Chequear el logout de la pagina inicial
    Given el usuario se encuentra en la pagina Principal
    When da clic en el apartado Bob Tester
    Then chequea que el link Logout esta disponible

  Scenario: Verificar que la imagen del toolBar esta presente
    Given el usuario se encuentra en la pagina Principal
    When al dar clic en el link Dashboard
    Then Verifica que se encuientra en el apartado con el texto Dashboard
