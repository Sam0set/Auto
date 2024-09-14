@Suite @Login
Feature: Login

  Background: Iniciar sesion en la web Orange

    Given el usuario navega al sitio web
    Scenario: Iniciar sesion
      When inicio de sesion
      Then se redirige a la pag principal


