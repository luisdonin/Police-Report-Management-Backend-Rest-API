package com.br.td.utfpr.edu.tsi.cadastro_usuarios.service;

import com.br.td.utfpr.edu.tsi.cadastro_usuarios.model.Usuario;
import org.jvnet.hk2.annotations.Service;

import java.util.List;
@Service
public interface UsuarioService {

    public void cadastrar(Usuario usuario);

    public void atualizar(Usuario usuario);

    public void remover(String idUsuario);

    public Usuario localizar(String idUsuario);

    public List<Usuario> listarTodos();

}
