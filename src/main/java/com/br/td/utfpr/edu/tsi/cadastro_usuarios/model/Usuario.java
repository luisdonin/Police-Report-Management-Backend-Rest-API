package com.br.td.utfpr.edu.tsi.cadastro_usuarios.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usuario {
    @Id
    private String id;
    private String nome;
    private String email;
    private String idade;
    private String envolvimento;
    private String veiculo;
    private String emplacamento;
    private String logradouroOcorrencia;
    private String bairroOcorrencia;
    private String cidadeOcorrencia;
    private String estadoOcorrencia;

    public Usuario(String id, String nome, String email, String idade, String envolvimento,  String veiculo, String emplacamento, String logradouroOcorrencia, String bairroOcorrencia, String cidadeOcorrencia, String estadoOcorrencia) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.envolvimento = envolvimento;
        this.veiculo = veiculo;
        this.emplacamento = emplacamento;
        this.logradouroOcorrencia = logradouroOcorrencia;
        this.bairroOcorrencia = bairroOcorrencia;
        this.cidadeOcorrencia = cidadeOcorrencia;
        this.estadoOcorrencia = estadoOcorrencia;
    }

    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnvolvimento() {return envolvimento;}
    public void setEnvolvimento(String envolvimento) {this.envolvimento = envolvimento;}

    public String getVeiculo() {return veiculo;}
    public void setVeiculo(String veiculo) {this.veiculo = veiculo;}

    public String getEmplacamento() {return emplacamento;}
    public void setEmplacamento(String emplacamento) {this.emplacamento = emplacamento;}

    public String getLogradouroOcorrencia() {return logradouroOcorrencia;}
    public void setLogradouroOcorrencia(String logradouroOcorrencia) {this.logradouroOcorrencia = logradouroOcorrencia;}

    public String getBairroOcorrencia() {return bairroOcorrencia;}
    public void setBairroOcorrencia(String bairroOcorrencia) {this.bairroOcorrencia = bairroOcorrencia;}

    public String getCidadeOcorrencia() {return cidadeOcorrencia;}
    public void setCidadeOcorrencia(String cidadeOcorrencia) {this.cidadeOcorrencia = cidadeOcorrencia;}

    public String getEstadoOcorrencia() {return estadoOcorrencia;}
    public void setEstadoOcorrencia(String estadoOcorrencia) {this.estadoOcorrencia = estadoOcorrencia;}

}


