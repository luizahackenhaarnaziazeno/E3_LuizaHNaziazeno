# Fundamentos de Desenvolvimento de Software
## Exercício De Avaliação 3
## Integrantes:Luiza Hackenhaar Naziazeno
Usando JBA

## Endpoint

| Método | Endpoint                                       |
|--------|------------------------------------------------|
| GET    | `/acmerescue/cadastro/listaeventos`            |

### Descrição
Este endpoint fornece uma lista de todos os eventos cadastrados no sistema.

### Parâmetros de Entrada

| Parâmetro | Tipo    | Descrição                                      |
|-----------|---------|------------------------------------------------|
| Nenhum    | -       | Este endpoint não requer parâmetros de entrada. |

### Resposta (JSON)

A resposta será um array de objetos, onde cada objeto representa um evento. A estrutura do evento é a seguinte:

| Atributo  | Tipo   | Descrição                                      |
|-----------|--------|------------------------------------------------|
| `codigo`  | string | Código único do evento.                        |
| `descricao` | string | Descrição do evento.                          |
| `data`    | string | Data do evento, no formato ISO 8601 (YYYY-MM-DDTHH:MM:SSZ). |
| Outros    | -      | Outros atributos podem ser incluídos conforme a implementação. |

