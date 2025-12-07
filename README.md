# 🍎 App Vida Saudável (Healthy Life App)

> Uma aplicação em Java desenvolvida para auxiliar no monitoramento de saúde e planejamento nutricional.

Este projeto é uma calculadora de saúde via terminal (CLI) que processa dados do usuário para fornecer métricas essenciais como Índice de Massa Corporal (IMC) e estimativas de macronutrientes baseadas no nível de atividade física.

## 🚀 Funcionalidades

O sistema recebe o peso e a altura do usuário e realiza as seguintes operações lógicas:

* **Cálculo de IMC (Índice de Massa Corporal):** Verifica se o peso está adequado para a altura.
* **Tratamento Inteligente de Dados:** Identifica automaticamente se a altura foi inserida em centímetros (ex: 175) ou metros (ex: 1.75) e faz a conversão necessária antes do cálculo.
* **Calculadora Nutricional Personalizada:** Estima a quantidade diária recomendada de:
    * **Calorias (Kcal):** Baseada no objetivo (Ganho de massa, Manutenção ou Sedentarismo).
    * **Proteínas (g):** Ajustada conforme o fator de atividade física.
* **Formatação de Saída:** Uso de `printf` para limitar casas decimais e apresentar dados limpos.
* **Internacionalização:** Uso da classe `Locale` para aceitar entradas com ponto flutuante (padrão US).

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK)
* **Entrada de Dados:** `java.util.Scanner`
* **Configuração Regional:** `java.util.Locale`
* **IDE:** NetBeans 8.2

## 💻 Como executar

Para rodar a aplicação diretamente pelo Terminal/Prompt de Comando (DOS), acesse a pasta raiz do projeto e digite o seguinte comando:

```bash 
java -cp build\classes Calculo.vidaSaudavel
```
## 📋 Como usar

**Ao executar o programa, o usuário deve inserir:**

**Peso atual.**

**Altura (aceita formatos como 1.75 ou 175).**

**Escolha do objetivo/perfil:**

*  Ganho de Massa Muscular

*  Sedentário

*  Ativo
```bash 
BEM VINDO AO APP VIDA SAUDÁVEL
Neste aplicativo, você saberá quanto de proteína e calorias deve comer por dia, bem como o seu IMC.
DETALHE: UTILIZE O PADRÃO AMERICANO COM PONTO '.' (EX: 1.75)

Digite o seu peso:
60.18
Digite a sua altura: 
1.74
Escolha a sua meta:
1 - Para ganhar massa muscular
2 - Para sedentários
3 - Para ativos
1
--------------------------------
Seu IMC é: 19.88 
Proteína Diária: 102.31g
Calorias Diárias: 2407.2kcal
--------------------------------

```

## 👨‍💻 Autor
Desenvolvido por Tiago de Aquino Nunes durante estudos de Lógica de Programação e Java.
