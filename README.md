# Sistema de Consultas Médicas

Bem-vindo ao **Sistema de Consultas Médicas**! Este projeto foi desenvolvido para facilitar a gestão de consultas médicas, permitindo que **médicos** e **pacientes** realizem operações de maneira eficiente e intuitiva.

A aplicação foi construída utilizando **JavaFX** para a interface gráfica e **MySQL** como banco de dados, oferecendo uma solução robusta para o gerenciamento de consultas médicas.

---

## 🚀 Funcionalidades Implementadas

### 1. **Login de Médico e Paciente**
   - **Médicos** e **pacientes** podem realizar login no sistema para acessar suas funcionalidades exclusivas.

### 2. **Alteração de Dados**
   - **Médicos** podem alterar seus próprios dados cadastrais.
   - **Pacientes** podem atualizar suas informações pessoais, como contato e preferências.

### 3. **Agendamento de Consulta**
   - **Pacientes** podem agendar consultas com **médicos** de sua escolha, selecionando uma data disponível na agenda.

### 4. **Cancelamento de Agendamento**
   - **Pacientes** podem cancelar um agendamento. Caso haja uma lista de espera, o próximo paciente na fila será alocado automaticamente para o horário cancelado.

### 5. **Realização de Consulta**
   - **Médicos** podem registrar os detalhes das consultas realizadas, incluindo:
     - Sintomas
     - Tratamento sugerido
     - Medicamentos prescritos
     - Exames solicitados

### 6. **Relatórios**
   - O sistema gera relatórios detalhados, com informações sobre:
     - Consultas e agendamentos de um **médico** em um período específico.
     - Consultas realizadas por um **paciente** em um período determinado.

### 7. **Busca de Médicos**
   - **Pacientes** podem pesquisar médicos por **nome** e **especialidade**.
   - O sistema exibe informações detalhadas sobre os médicos, como:
     - Nome
     - Especialidade
     - Avaliação (em estrelas)
     - Últimas avaliações feitas pelos pacientes

### 8. **Lista de Espera**
   - Caso o médico esteja com a agenda lotada em um determinado dia, o **paciente** pode ser adicionado a uma **lista de espera**. O paciente será notificado caso uma vaga se libere.

### 9. **Pagamento por Consulta**
   - Para **pacientes** sem plano de saúde, é gerada uma conta de pagamento que varia conforme o **médico** e a **especialidade**.

### 10. **Avaliação de Médicos**
   - Após a consulta, os **pacientes** podem avaliar os médicos, fornecendo uma nota de 1 a 5 estrelas e escrevendo um comentário sobre a consulta realizada.

---

## 🛠️ Tecnologias Utilizadas

- **JavaFX**: Interface gráfica do usuário.
- **MySQL**: Banco de dados relacional.
- **JDBC**: Para conexão e manipulação do banco de dados.
- **Maven**: Gerenciamento de dependências e build do projeto.

---

## 📋 Pré-requisitos

Antes de rodar o projeto, é necessário ter os seguintes requisitos instalados:

- **JDK** 8 ou superior
- **MySQL** (ou outro banco de dados compatível)
- **Maven** (opcional, caso utilize para o build)

---

## 🚀 Como Rodar o Projeto

### 1. **Clonar o repositório**

```bash
git clone https://github.com/usuario/repository.git

### 2. **Configurar o Banco de Dados**

 ```bash 
 Crie um banco de dados no MySQL chamado consultas_medicas (ou modifique a configuração no arquivo config.properties para o seu banco de dados). 

 ### 3. **Instalar as Dependências** 
 
 ```bash 
 mvn install
