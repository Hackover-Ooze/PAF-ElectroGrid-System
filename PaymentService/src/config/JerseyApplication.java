/**
 * 
 */
package config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

/**
 * @author Abimani Kumarage
 *
 */
public class JerseyApplication extends ResourceConfig {
    public JerseyApplication() {
        packages("com");
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
    }
}
