<p align="right">
  <img src="https://i.gifer.com/origin/d8/d83e9951f28fc811c1166b16dcaec930_w200.gif" alt="GIF" width="200" />
</p>

# Sistema de Gestão Hospitalar

<div align="center">
  <h2>Bem-vindo ao <span style="color: #1E90FF;">Sistema de Gestão Hospitalar</span></h2>
</div>

Bem-vindo ao **Sistema de Gestão Hospitalar**, uma aplicação Java desenvolvida para facilitar o gerenciamento de pacientes e médicos em hospitais. Nosso sistema permite o cadastro de pacientes e médicos, controle de altas, registro de tratamentos e consulta rápida para localizar pacientes por nome ou ID.

## Funcionalidades

Este sistema foi desenvolvido para atender às principais necessidades de um hospital. As principais funcionalidades incluem:

- **Cadastro de Pacientes:** Registre informações detalhadas sobre os pacientes.
- **Cadastro de Médicos:** Cadastre os médicos responsáveis pelos tratamentos dos pacientes.
- **Alta de Pacientes:** Registre a alta de pacientes após o término de seu tratamento.
- **Cadastro de Tratamentos:** Registre os tratamentos realizados aos pacientes.
- **Busca de Pacientes:** Localize rapidamente um paciente utilizando seu ID ou nome.

## Tecnologias Utilizadas

- **Linguagem de Programação:** Java (JDK 11 ou superior)
- **IDE:** Visual Studio Code (VS Code)
- **Biblioteca:** Swing
- **Banco de Dados:** MySQL  
- **Gerenciador de Dependências:** Maven
- **Versão Java:** JDK 11 ou superior

## Como Usar

### 1. Clonar o Repositório

Clone este repositório para sua máquina local:

## Como Usar

### 1. Clonar o Repositório

Clone este repositório para sua máquina local:

```bash
git clone https://github.com/JulianaForbici/TrabalhoJavaHospital.git

```

### 2. Crie o Banco de Dados 'Hospital' e adcione as seguintes tabelas: 

```
CREATE DATABASE HOSPITAL;
````
````
CREATE TABLE patient (
    patient_id INT AUTO_INCREMENT PRIMARY KEY,  
    name VARCHAR(100) NOT NULL,               
    birthday DATE NOT NULL,                    
    sex ENUM('Masculino', 'Feminino', 'Outros') NOT NULL,  
    address VARCHAR(255),                        
    phone VARCHAR(15),                           
    creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
);
````
````

CREATE TABLE doctor (
    doctor_id INT AUTO_INCREMENT PRIMARY KEY,   
    name VARCHAR(100) NOT NULL,             
    specialization VARCHAR(100),                  
    phone VARCHAR(15),                           
    email VARCHAR(100)                           
);

````

### 3. Configuração e Execução

#### 3.1. Instalar o JDK

Certifique-se de que você tem o **JDK 11** ou superior instalado em sua máquina. Você pode verificar com o comando:

```
java -version
````
#### 3.2. Instalar o Visual Studio Code

Se você ainda não possui o **Visual Studio Code** (VS Code), baixe em: [Visual Studio Code](https://code.visualstudio.com/).

#### 3.3. Instalar Dependências

Abra o terminal no diretório do projeto e execute o seguinte comando para instalar as dependências com o Maven:
````
mvn install
````
<p align="center">
<img src="https://i.imgflip.com/3olml1.gif" alt="GIF final" width="300" />
</p>





