package com.br.td.utfpr.edu.tsi.cadastro_usuarios.repository;

import com.br.td.utfpr.edu.tsi.cadastro_usuarios.model.Boletim;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoletimRepository extends MongoRepository<Boletim, String> {
    List<Boletim> findByCidadeOcorrencia(String cidadeOcorrencia);
    List<Boletim> findByPeriodoOcorrencia(String periodoOcorrencia);
    List<Boletim> findByEmplacamento(String emplacamento);
    List<Boletim> findByCorVeiculo(String corVeiculo);
    List<Boletim> findByTipoVeiculo(String tipoVeiculo);
    List<Boletim> findByCidadeOcorrenciaAndPeriodoOcorrencia(String cidadeOcorrencia, String periodoOcorrencia);
    List<Boletim> findByEmplacamentoAndCorVeiculoAndTipoVeiculo(String emplacamento, String corVeiculo, String tipoVeiculo);
}
