<p align="center">
  <img src="https://pa1.aminoapps.com/6334/37de8b9f15dd3e6a38e338184837e472fccd3cd5_hq.gif" alt="GIF" />
</p>

# Sistema de Gestão Hospitalar

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



