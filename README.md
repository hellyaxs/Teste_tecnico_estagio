# Estágio em Desenvolvimento - Ribeirão Preto Trabalho Remoto Estágio  

![GitHub repo size](https://img.shields.io/github/repo-size/iuricode/README-template?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/iuricode/README-template?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/iuricode/README-template?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/iuricode/README-template?style=for-the-badge)


### 📝 Resposta da Questão 3

> 3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
Ao final do processamento, qual será o valor da variável SOMA?


Vamos acompanhar as mudanças nos valores de K e SOMA em cada iteração:

Iteração 1: K = 2, SOMA = 2 

Iteração 2: K = 3, SOMA = 5

Iteração 3: K = 4, SOMA = 9

Iteração 4: K = 5, SOMA = 14

Iteração 5: K = 6, SOMA = 20

Iteração 6: K = 7, SOMA = 27

Iteração 7: K = 8, SOMA = 35

Iteração 8: K = 9, SOMA = 44

Iteração 9: K = 10, SOMA = 54

Iteração 10: K = 11, SOMA = 65

Iteração 11: K = 12, SOMA = 77


Quando K é incrementado para 12, K não é mais menor que INDICE (ambos são 12), então o loop termina.
Resultado:
Ao final do processamento, o valor da variável **SOMA é 77**.

### 📝  Resposta da Questão 4

> 4) Descubra a lógica e complete o próximo elemento:

- a) 1, 3, 5, 7, __`9`__
- b) 2, 4, 8, 16, 32, 64, __`128`__
- c) 0, 1, 4, 9, 16, 25, 36, __`49`__
- d) 4, 16, 36, 64, __`100`__
- e) 1, 1, 2, 3, 5, 8, __`13`__
- f) 2,10, 12, 16, 17, 18, 19, __`200`__


### 📝  Resposta da Questão 5


> 5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?  


Para descobrir qual interruptor controla cada lâmpada, siga estes passos:

**1. Primeira ida:**

- Ligue o primeiro interruptor (I1) e deixe-o ligado por alguns minutos.
- Depois, desligue o primeiro interruptor (I1) e ligue o segundo interruptor (I2).
- Deixe o terceiro interruptor (I3) desligado.

**2. Segunda ida (vá até a sala das lâmpadas):**

- A lâmpada que está acesa corresponde ao segundo interruptor (I2).
- A lâmpada que está apagada e quente corresponde ao primeiro interruptor (I1).
- A lâmpada que está apagada e fria corresponde ao terceiro interruptor (I3).
Assim, você consegue identificar qual interruptor controla qual lâmpada.



## 📫 Contribuindo 

Para contribuir com o projeto, siga estas etapas:

1. Bifurque este repositório.
2. Crie um branch: `git checkout -b <nome_branch>`.
3. Faça suas alterações e confirme-as: `git commit -m '<mensagem_commit>'`
4. Envie para o branch original: `git push origin <nome_do_projeto> / <local>`
5. Crie a solicitação de pull.

Como alternativa, consulte a documentação do GitHub em [como criar uma solicitação pull](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request).
