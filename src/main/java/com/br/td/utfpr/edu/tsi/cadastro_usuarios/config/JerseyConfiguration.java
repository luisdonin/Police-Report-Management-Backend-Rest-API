package com.br.td.utfpr.edu.tsi.cadastro_usuarios.config;


import com.br.td.utfpr.edu.tsi.cadastro_usuarios.endpoint.UsuarioEndpoint;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/cliente_api")
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        this.register(UsuarioEndpoint.class);
    }
}
