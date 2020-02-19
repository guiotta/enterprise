package br.com.otta.enterprise.configuration;

import javax.inject.Inject;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import br.com.otta.enterprise.controller.EnterpriseController;

@Configuration
public class JerseyConfig extends ResourceConfig {

    @Inject
    public JerseyConfig() {
        register(EnterpriseController.class);
    }
}
