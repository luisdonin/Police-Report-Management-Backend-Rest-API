package com.br.td.utfpr.edu.tsi.cadastro_usuarios.repository;

import com.br.td.utfpr.edu.tsi.cadastro_usuarios.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
