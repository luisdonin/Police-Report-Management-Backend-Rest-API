package com.br.td.utfpr.edu.tsi.cadastro_usuarios.service;

import com.br.td.utfpr.edu.tsi.cadastro_usuarios.model.Boletim;
import com.br.td.utfpr.edu.tsi.cadastro_usuarios.repository.BoletimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class BoletimServiceImpl implements BoletimService {

    @Autowired
    private BoletimRepository boletimRepository;

    @Override
    public void cadastrar(Boletim boletim) {
        boletim.setId(UUID.randomUUID().toString());
        boletimRepository.save(boletim);
    }

    @Override
    public Boletim localizar(String idBoletim) {
        Optional<Boletim> usuario = boletimRepository.findById(idBoletim);
        if (usuario.isPresent()) {
            return usuario.get();
        }
        return null;
    }

    @Override
    public List<Boletim> listarTodos() {
        return boletimRepository.findAll();
    }

    @Override
    @Transactional
    public void atualizar(Boletim boletim) {
        if (boletim == null || boletim.getId() == null) {
            throw new IllegalArgumentException("Nome e id não podem ser nulos.");
        }

        // Verifica se  existe antes de atualizar
        if (!boletimRepository.existsById(boletim.getId())) {
            throw new IllegalArgumentException("Nome  não encontrado com id: " + boletim.getId());
        }

        // Salva a entidade (merge/update)
        boletimRepository.save(boletim);
    }

    @Override
    public void remover(String idBoletim) {
        boletimRepository.deleteById(idBoletim);
    }

    @Override
    public List<Boletim> listarBoletinsFiltrados(String id, String cidade, String periodo) {
        if (id != null && !id.trim().isEmpty()) {
            Boletim b = localizar(id);
            return b != null ? List.of(b) : List.of();
        }
        if (cidade != null && !cidade.trim().isEmpty() && periodo != null && !periodo.trim().isEmpty()) {
            return boletimRepository.findByCidadeOcorrenciaAndPeriodoOcorrencia(cidade, periodo);
        } else if (cidade != null && !cidade.trim().isEmpty()) {
            return boletimRepository.findByCidadeOcorrencia(cidade);
        } else if (periodo != null && !periodo.trim().isEmpty()) {
            return boletimRepository.findByPeriodoOcorrencia(periodo);
        } else {
            return listarTodos();
        }
    }

    @Override
    public List<Boletim> listarVeiculosFurtadosFiltrados(String placa, String cor, String tipo) {
        List<Boletim> result = listarTodos();
        if (placa != null && !placa.trim().isEmpty()) {
            result = result.stream().filter(b -> placa.equals(b.getEmplacamento())).toList();
        }
        if (cor != null && !cor.trim().isEmpty()) {
            result = result.stream().filter(b -> cor.equals(b.getCorVeiculo())).toList();
        }
        if (tipo != null && !tipo.trim().isEmpty()) {
            result = result.stream().filter(b -> tipo.equals(b.getTipoVeiculo())).toList();
        }
        return result;
    }
}
