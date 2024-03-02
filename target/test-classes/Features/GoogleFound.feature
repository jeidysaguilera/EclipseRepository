Feature: Buscar en Google

  Scenario: Verificar que la pagina de google busque informacion
    Given Estoy en la pagina de seccion de busqueda en google
    When escribo la informacion a buscar "automation step by step"
    And presiono Enter
    Then Obtengo informacion de la pagina
