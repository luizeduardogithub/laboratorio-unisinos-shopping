# Laboratório Unisinos — Sistema de Shopping

Projeto desenvolvido em Java para simular a estrutura de um shopping center com diferentes tipos de lojas, controle de estoque e validação automática por etapas.

O sistema foi construído com foco em programação orientada a objetos, utilizando herança, polimorfismo e manipulação de arrays.

---

## Objetivo

Aplicar conceitos fundamentais de programação orientada a objetos:

- Encapsulamento  
- Herança e polimorfismo  
- Organização de classes e responsabilidades  
- Manipulação de arrays nativos  
- Estruturação de sistema em múltiplas entidades  
- Validação automatizada por testes em etapas  

---

## Estrutura do sistema

### Classes base

**Data**  
Responsável por manipulação de datas e verificação de ano bissexto.

**Endereco**  
Armazena informações de localização.

**Produto**  
Controle de produtos com preço e data de validade.

---

### Classe principal

**Loja**  
Representa uma loja no shopping com:

- Controle de funcionários  
- Cálculo de gastos com salários  
- Gerenciamento de estoque de produtos  

---

### Tipos de lojas (herança)

- Cosmetico  
- Vestuario  
- Bijuteria  
- Alimentacao  
- Informatica  

Cada classe adiciona atributos específicos ao modelo base.

---

### Shopping

Classe responsável por gerenciar o conjunto de lojas do sistema:

- Inserção e remoção de lojas  
- Controle por capacidade fixa  
- Contagem de lojas por tipo  
- Identificação de loja de informática com maior seguro  

---

## Funcionalidades

- Cadastro de lojas  
- Controle de estoque com arrays fixos  
- Remoção segura de elementos  
- Cálculo de folha salarial  
- Verificação de produtos vencidos  
- Classificação por tipo de loja  
- Busca de loja especializada  

---

## Validação

O projeto foi validado automaticamente em etapas:

- Etapa 1: classes base  
- Etapa 2: classe Loja  
- Etapa 3: herança das lojas especializadas  
- Etapa 4: sistema completo com Shopping e estoque  

Todos os validadores foram aprovados.

---

## Tecnologias utilizadas

- Java (JDK 25)  
- Programação orientada a objetos  
- Arrays nativos  
- Ambiente de validação acadêmica  

---

## Como executar

```bash
javac *.java
java ValidadorEtapa1
java ValidadorEtapa2
java ValidadorEtapa3
java ValidadorEtapa4
