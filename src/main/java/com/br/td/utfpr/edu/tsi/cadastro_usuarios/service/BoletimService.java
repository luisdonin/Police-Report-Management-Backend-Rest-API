package com.br.td.utfpr.edu.tsi.cadastro_usuarios.service;

import com.br.td.utfpr.edu.tsi.cadastro_usuarios.model.Boletim;
import org.jvnet.hk2.annotations.Service;

import java.util.List;
@Service
public interface BoletimService {

    public void cadastrar(Boletim boletim);

    public void atualizar(Boletim boletim);

    public void remover(String idBoletim);

    Boletim localizar(String idBoletim);

    List<Boletim> listarTodos();
    List<Boletim> listarBoletinsFiltrados(String id, String cidade, String periodo);
    List<Boletim> listarVeiculosFurtadosFiltrados(String placa, String cor, String tipo);



}
