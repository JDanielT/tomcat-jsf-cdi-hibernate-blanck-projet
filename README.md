# Blanck Project - Tomcat + JSF + CDI + HIBERNATE

Este é um projeto "em branco" com toda a estrutura pronta para executar com Java Server Faces, CDI e Hibernate.

Contém classes comuns utilizadas em projetos com configuração parecida como:
 - DAOGenerico: Classe com métodos de CRUDS
 - AbastractBean: Classe com métodos de chamada as operaçoes de persistencia e recuperação de dados
 - Pacote transacional: Contém a estrutura para anotações de Injeção de Entity Manager
 - Pacote auth: Contém estrutura de classes para usar o módulo de login do tomcat (Autorização e Autênticação)
 - Pacote util: Classes para recuperação de parâmetros de requisições, atalhos para mensagens e hashes de senhas
 - Pacote conversores: Convesores padrões para entidades que são filhas da interface BaseEntity (localizada no pacote entidades)
 
As principais dependências do projeto são (veja o ```pom.xml```):

```
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-entitymanager</artifactId>
            <version>5.2.10.Final</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>5.2.4.Final</version>
        </dependency>
        <dependency>
            <groupId>org.jboss.weld.servlet</groupId>
            <artifactId>weld-servlet</artifactId>
            <version>2.3.3.Final</version>
        </dependency>
        <dependency>
            <groupId>com.sun.faces</groupId>
            <artifactId>jsf-impl</artifactId>
            <version>2.2.13</version>
        </dependency>
```

***
OBS: É necessário adicionar e configurar o arquivo ```persistence.xml```
***

**Zone!**

