package io.quarkus.workshop.superheroes.fight;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationPath("/")
@OpenAPIDefinition(
    info = @Info(title = "Fight API",
        description = "This API allows a hero and a villain to fight",
        version = "1.0"),
    servers = {
        @Server(url = "http://localhost:8082")
    },
  
    tags = {
        @Tag(name = "api", description = "Public that can be used by anybody"),
        @Tag(name = "fight", description = "Anybody interested in fights"),
        @Tag(name = "superheroes", description = "Well, superhero fights")
    }
)
public class FightApplication extends Application {
}