package com.br.td.utfpr.edu.tsi.cadastro_usuarios.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Boletim {
    @Id
    private String id;
    private String nome;
    private String email;
    private String idade;
    private String numeroBoletimOriginal;
    private String envolvimento;
    private String veiculo;
    private String emplacamento;
    private String logradouroOcorrencia;
    private String bairroOcorrencia;
    private String cidadeOcorrencia;
    private String estadoOcorrencia;
    private String periodoOcorrencia;
    private String corVeiculo;
    private String tipoVeiculo;

    public Boletim(String id, String nome, String email, String idade, String numeroBoletimOriginal, String envolvimento, String veiculo, String emplacamento, String logradouroOcorrencia, String bairroOcorrencia, String cidadeOcorrencia, String estadoOcorrencia, String periodoOcorrencia, String corVeiculo, String tipoVeiculo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.numeroBoletimOriginal = numeroBoletimOriginal;
        this.envolvimento = envolvimento;
        this.veiculo = veiculo;
        this.emplacamento = emplacamento;
        this.logradouroOcorrencia = logradouroOcorrencia;
        this.bairroOcorrencia = bairroOcorrencia;
        this.cidadeOcorrencia = cidadeOcorrencia;
        this.estadoOcorrencia = estadoOcorrencia;
        this.periodoOcorrencia = periodoOcorrencia;
        this.corVeiculo = corVeiculo;
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNumeroBoletimOriginal() {return numeroBoletimOriginal;}
    public void setNumeroBoletimOriginal(String numeroBoletimOriginal) {this.numeroBoletimOriginal = numeroBoletimOriginal;}

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

    public String getPeriodoOcorrencia() {return periodoOcorrencia;}
    public void setPeriodoOcorrencia(String periodoOcorrencia) {this.periodoOcorrencia = periodoOcorrencia;}

    public String getCorVeiculo() {return corVeiculo;}
    public void setCorVeiculo(String corVeiculo) {this.corVeiculo = corVeiculo;}

    public String getTipoVeiculo() {return tipoVeiculo;}
    public void setTipoVeiculo(String tipoVeiculo) {this.tipoVeiculo = tipoVeiculo;}

}
