package de.springbootbuch.jaxrs;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Part of springbootbuch.de.
 *
 * @author Michael J. Simons
 * @author @rotnroll666
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(FilmRestEndpoint.class);
    }
}