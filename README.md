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
