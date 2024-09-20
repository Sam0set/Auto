@Prueba
Feature: ingresar en pag web
  Como usuario
  Quiero ingresar a la pagina Orange
  Para poder registrarme como user

  Scenario: ingresar a la pagina Orange
    Given "Usuario" ingresa a Orange
    When coloca usuario y contraseña
    Then  se logea exitosamente

