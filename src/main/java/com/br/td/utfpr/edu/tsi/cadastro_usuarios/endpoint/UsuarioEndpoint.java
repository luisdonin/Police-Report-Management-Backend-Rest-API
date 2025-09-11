package com.br.td.utfpr.edu.tsi.cadastro_usuarios.endpoint;


import com.br.td.utfpr.edu.tsi.cadastro_usuarios.model.Usuario;
import com.br.td.utfpr.edu.tsi.cadastro_usuarios.service.UsuarioService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Path("usuario")
public class UsuarioEndpoint {

    @Autowired
    private UsuarioService usuarioService;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findUsuario(@PathParam("id") String id) {
        Usuario usuario = usuarioService.localizar(id);
        return Response.ok(usuario).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarTodos() {
        List<Usuario> usuarios = usuarioService.listarTodos();
        return Response.ok(usuarios).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response save(Usuario usuario) {
        usuarioService.cadastrar(usuario);
        return Response.ok().build();
    }
}