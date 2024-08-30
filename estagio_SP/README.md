# Estágio em Desenvolvimento - São Paulo Trabalho Remoto Estágio  

![GitHub repo size](https://img.shields.io/github/repo-size/iuricode/README-template?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/iuricode/README-template?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/iuricode/README-template?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/iuricode/README-template?style=for-the-badge)


### 📝 Resposta da Questão 1

> 1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
Ao final do processamento, qual será o valor da variável SOMA?


Vamos acompanhar as mudanças nos valores de K e SOMA em cada iteração:

Iteração 1: K = 1, SOMA = 1

Iteração 2: K = 2, SOMA = 3

Iteração 3: K = 3, SOMA = 6

Iteração 4: K = 4, SOMA = 10

Iteração 5: K = 5, SOMA = 15

Iteração 6: K = 6, SOMA = 21

Iteração 7: K = 7, SOMA = 28

Iteração 8: K = 8, SOMA = 36

Iteração 9: K = 9, SOMA = 45

Iteração 10: K = 10, SOMA = 55

Iteração 11: K = 11, SOMA = 66

Iteração 12: K = 12, SOMA = 78

Iteração 13: K = 13, SOMA = 91


Quando K é incrementado para 13, K não é mais menor que INDICE (ambos são 13), então o loop termina.
Resultado:
Ao final do processamento, o valor da variável **SOMA é 91**.


## 💻 Pré-requisitos para executar os codigos:

- python 3.***

- java 8 ou superior



## 📫 Contribuindo 

Para contribuir com o projeto, siga estas etapas:

1. Bifurque este repositório.
2. Crie um branch: `git checkout -b <nome_branch>`.
3. Faça suas alterações e confirme-as: `git commit -m '<mensagem_commit>'`
4. Envie para o branch original: `git push origin <nome_do_projeto> / <local>`
5. Crie a solicitação de pull.

Como alternativa, consulte a documentação do GitHub em [como criar uma solicitação pull](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request).
