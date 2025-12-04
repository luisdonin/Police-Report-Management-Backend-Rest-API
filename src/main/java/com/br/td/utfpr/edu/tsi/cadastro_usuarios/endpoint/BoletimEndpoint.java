package com.br.td.utfpr.edu.tsi.cadastro_usuarios.endpoint;


import com.br.td.utfpr.edu.tsi.cadastro_usuarios.model.Boletim;
import com.br.td.utfpr.edu.tsi.cadastro_usuarios.service.BoletimService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Path("boletim")
public class BoletimEndpoint {

    @Autowired
    private BoletimService boletimService;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findBoletim(@PathParam("id") String id) {
        Boletim boletim = boletimService.localizar(id);
        return Response.ok(boletim).build();
    }

    @GET
    @Path("/remover/{id}")
    public Response removerBoletim(@PathParam("id") String id) {
        boletimService.remover(id);
        return Response.ok().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarTodos() {
        List<Boletim> boletins = boletimService.listarTodos();
        return Response.ok(boletins).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response save(Boletim boletim) {
        boletimService.cadastrar(boletim);
        return Response.ok().build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizar(@PathParam("id") String id, Boletim boletim) {
        if (boletim == null) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(" Nome é obrigatório.")
                    .build();
        }

     
        if (boletim.getId() != null && !boletim.getId().equals(id)) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("O id deve corresponder ao id da URL.")
                    .build();
        }

     
        boletim.setId(id);

        try {
            boletimService.atualizar(boletim);
            
            return Response.noContent().build();
        } catch (IllegalArgumentException e) {
            String msg = e.getMessage() != null ? e.getMessage() : "Requisição inválida.";
            if (msg.contains("não encontrado")) {
                return Response.status(Response.Status.NOT_FOUND).entity(msg).build();
            }
            return Response.status(Response.Status.BAD_REQUEST).entity(msg).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao atualizar boletim: " + e.getMessage())
                    .build();
        }
    }

    @GET
    @Path("/filtrados")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarBoletinsFiltrados(@QueryParam("id") String id, @QueryParam("cidade") String cidade, @QueryParam("periodo") String periodo) {
        List<Boletim> boletins = boletimService.listarBoletinsFiltrados(id, cidade, periodo);
        return Response.ok(boletins).build();
    }

    @GET
    @Path("/veiculos/furtados/filtrados")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarVeiculosFurtadosFiltrados(@QueryParam("placa") String placa, @QueryParam("cor") String cor, @QueryParam("tipo") String tipo) {
        List<Boletim> boletins = boletimService.listarVeiculosFurtadosFiltrados(placa, cor, tipo);
        return Response.ok(boletins).build();
    }
}
