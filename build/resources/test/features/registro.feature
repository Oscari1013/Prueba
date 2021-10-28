#Realizado por: Oscar Ivan Rincon

  @stories
  Feature: Registro de Usuario en la Pagina

    @scenario:

    Scenario: Registro de usuario en la pagina
      Given Se desea registrar a un usuario en la pagina
      When  Se diligenciara un formulario con los datos del usuario requerdios por el sistema
        | strNombre | strApellido | strEmail               | strAnoNacimiento | strMesNacimiento | strDiaNacimiento | strCiudad | strZip | strPais  | strDispositivo | strModelo        | strSo         | strClave         |
        | Oscar     | Rincon      | juanes1032@hotmail.com | 1986             | May              |             23   | Bogota    | 110101 | Colombia | Alcatel        | Crystal          | Android 7.0   | Oira.1032370453  |
      Then porteriormente se debe clickear el boton de regitro para finalizar el mismo
        | strTxt   |
        | Complete |

