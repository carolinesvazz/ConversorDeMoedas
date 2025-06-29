# Conversor de Moedas 💰

Este projeto foi desenvolvido com os conhecimentos adquiridos na fase de especialização em Back-End do programa Oracle Next Education/ONE - Alura. O objetivo é construir um conversor de moedas com suporte a pelo menos 6 moedas, utilizando uma API para conversão de valores, Java SE e biblioteca Gson para manipular JSON. A ferramenta utilizada foi IntelliJ-IDEA

## 🖼 Demonstração

![tela1](https://github.com/user-attachments/assets/0c9e3d52-e094-4160-9c2f-740a0972efd3)
![tela2](https://github.com/user-attachments/assets/7780579e-c936-403f-8dde-f779135ec8f7)
![tela 4](https://github.com/user-attachments/assets/71eae47f-f9eb-434f-90cd-00246b1bd223)

## 📌 Funcionalidades

- ✅ Busca de taxa de conversão atual entre duas moedas via ExchangeRate API.
- 🔄 Implementação de leitor de variáveis de ambiente.
- 📊 Manipulação de dados JSON com Gson.

## Tecnologias Utilizadas 🛠️

- **Java** 21 (Java SE)
- **ExchangeRate API**
- **Gson** (para serialização e desserialização de JSON)

## Estrutura do Código 💻

- **ExchangeRateClient.java**

Esta classe é responsável por realizar requisições HTTP à API ExchangeRate. Ela utiliza o HttpClient para enviar requisições HTTP, HttpRequest para configurar as URLs das requisições e HttpResponse para capturar as respostas da API. As funções dessa classe são usadas para buscar os códigos das moedas suportadas e as taxas de conversão entre moedas. As excessões são implementadas para evitar erros durante o processo de reprodução dos códigos.

- **Principal**

Nesta classe você encontra Scanner para realizar a leitura da opção digitada pelo usuário, biblioteca Gson para complementar a classe de requisição da API, loops de repetição como: while para continuar com o programa até que o usuário digite algumas das opções para sair.

## Como Executar o Projeto ▶️

1. Clone este repositório:
   `bash
   git clone https://github.com/carolinesvazz/ConversorDeMoedas

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para utilizá-lo e modificá-lo conforme necessário.
