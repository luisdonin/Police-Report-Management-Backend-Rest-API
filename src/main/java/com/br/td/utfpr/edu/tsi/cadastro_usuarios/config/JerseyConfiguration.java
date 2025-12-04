package com.br.td.utfpr.edu.tsi.cadastro_usuarios.config;

import com.br.td.utfpr.edu.tsi.cadastro_usuarios.endpoint.BoletimEndpoint;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/cliente_api")
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        this.register(BoletimEndpoint.class);
        this.register(CorsFilter.class);
    }
}
