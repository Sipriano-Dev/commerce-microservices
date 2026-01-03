# 🧩 Commerce Microservices

Sistema backend baseado em arquitetura de microsserviços, desenvolvido com **Spring Boot**, focado em um domínio comercial simples (**produtos e vendas**).

Este projeto começou como uma base mínima de microsserviços e está sendo evoluído gradualmente com boas práticas, conceitos arquiteturais e novas tecnologias, servindo como **projeto de estudo e portfólio**, com foco em aprendizado real e evolução incremental.

---

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data MongoDB
- Maven
- Lombok
- MongoDB
- Docker (planejado)
- Spring Cloud / Config Server (planejado)

---

## 🏗️ Arquitetura atual

O sistema é composto pelos seguintes microsserviços:

- **product-service**  
  Responsável pelo gerenciamento de produtos e catálogo.  
  Atualmente possui persistência com **MongoDB**.

- **sales-service**  
  Responsável pelo processamento de vendas e regras de negócio relacionadas a pedidos.  
  Estrutura inicial criada, ainda sem persistência implementada.

Cada microsserviço é uma **aplicação Spring Boot independente**, versionada dentro de um único repositório (**monorepo**).

---

## 📁 Estrutura do repositório

- commerce-microservices
-	product-service
-	sales-service
-	.gitignore
-	README.md

## 🧠 Conceitos aplicados

- Arquitetura de microsserviços
- Separação por domínio
- Monorepo para versionamento
- Padronização de nomes e estrutura
- Persistência com MongoDB
- Configuração explícita e consciente
- Evolução incremental do sistema
## 🛠️ Próximos passos planejados
- [x] Estrutura inicial do monorepo
- [x] Criação dos microsserviços base (product-service e sales-service)
- [x] Persistência com MongoDB (product-service)
- [ ] Persistência com MongoDB (sales-service)
- [ ] Definição completa de modelos de domínio
- [ ] Externalização de configurações com Config Server
- [ ] Comunicação entre microsserviços
- [ ] Profiles e ambientes
- [ ] Service discovery
- [ ] API Gateway
- [ ] Observabilidade (logs e métricas)
- [ ] Testes unitários
- [ ] Testes de integração
- [ ] Autenticação e autorização
- [ ] Containerização completa com Docker
## 📖 Observação
Este projeto é incremental e reflete minha evolução prática no estudo de arquitetura de microsserviços e backend distribuído.
Cada melhoria será implementada de forma consciente, priorizando clareza, boas práticas e aprendizado real.
