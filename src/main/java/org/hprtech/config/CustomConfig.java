package org.hprtech.config;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
@ConfigProperties(prefix = "quarkus.datasource")
public class CustomConfig {
    @ConfigProperty(name = "db-kind")
    public String dbKind;

    @ConfigProperty(name = "username")
    public String username;

    @ConfigProperty(name = "password")
    public String password;
}
