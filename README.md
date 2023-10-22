# Santander Bootcamp Java FullStack
Java API REST Full criada com base no Bar Bem Brasil, negócio da minha família.

## Diagrama da classes

```mermaid
  classDiagram
  class Cliente {
    -Number id
    -String nome
    -Bebidas bebidas
  }

  class Bebidas {
    -Number id
    -String tipo
  }

  class ClienteService {
    -ClienteRepository clienteRepository
  }
  
  class ClienteController {
    -ClienteService clienteService 
  } 

  Cliente "1" *-- "1..*" Bebidas
  ClienteService <-- ClienteRepository
  ClienteController <-- ClienteService
  Cliente --> ClienteController

```
# Importante
Este projeto foi construído com um viés totalmente educacional para o bootcamp afim de disponibilizar uma API local, sendo possível realizar métodos post & get.
