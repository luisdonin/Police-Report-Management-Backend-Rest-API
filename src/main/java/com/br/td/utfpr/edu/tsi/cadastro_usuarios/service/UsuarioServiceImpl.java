package com.br.td.utfpr.edu.tsi.cadastro_usuarios.service;

import com.br.td.utfpr.edu.tsi.cadastro_usuarios.model.Usuario;
import com.br.td.utfpr.edu.tsi.cadastro_usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void cadastrar(Usuario usuario) {
        usuario.setId(UUID.randomUUID().toString());
        usuarioRepository.save(usuario);
    }

    @Override
    public Usuario localizar(String idUsuario) {
        Optional<Usuario> usuario = usuarioRepository.findById(idUsuario);
        if (usuario.isPresent()) {
            return usuario.get();
        }
        return null;
    }

    @Override
    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    @Override
    public void atualizar(Usuario usuario) {
        // TODO Auto-generated method stub
    }

    @Override
    public void remover(String idUsuario) {
        // TODO Auto-generated method stub
    }
}
