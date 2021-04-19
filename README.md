### WebServices FIAP

Projeto desenvolvido utilizando a linguagem <ins>__Java__</ins> com o auxílio do <ins>__Spring Boot__</ins> e <ins>__Spring Data__</ins>. Optamos por utilizar o <ins>__banco H2__</ins>. 

* Para testar a endpoint (http://localhost:8080/ocorrencia) que executa um método POST, basta subir a aplicação normalmente e enviar no Postman um JSON como:

{<br />
    "pjoClienteUnidade": "Ana Lopes",<br />
    "pjoEmpreendId": 123,<br />
    "pjoBloco": 2,<br />
    "pjoUnidade": 11,<br />
    "pjoBandeira": "VIVAZ",<br />
    "description": "Manutenção"<br />
}

* A endpoint (http://localhost:8080/ocorrencia/1) realizando um método GET irá recuperar a ocorrência inserida anteriormente.
