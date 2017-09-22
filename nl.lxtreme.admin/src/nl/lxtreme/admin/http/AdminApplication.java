package nl.lxtreme.admin.http;

import static nl.lxtreme.admin.http.AdminServletContextHelper.ADMIN_CONTEXT_NAME;
import static org.amdatu.web.rest.jaxrs.AmdatuWebRestConstants.JAX_RS_APPLICATION_BASE;
import static org.amdatu.web.rest.jaxrs.AmdatuWebRestConstants.JAX_RS_APPLICATION_CONTEXT;
import static org.amdatu.web.rest.jaxrs.AmdatuWebRestConstants.JAX_RS_APPLICATION_TYPE;
import static org.amdatu.web.rest.jaxrs.AmdatuWebRestConstants.JAX_RS_APPLICATION_TYPE_STATIC;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.apache.felix.dm.annotation.api.Component;
import org.apache.felix.dm.annotation.api.Property;

import nl.lxtreme.admin.rest.AdminResource;

/**
 * Defines a static application that registers a single REST resource, the only
 * thing special here is the binding to the `adminCtx`.
 */
@Component(provides = Application.class, properties = {
		@Property(name = JAX_RS_APPLICATION_BASE, value = "/"),
        @Property(name = JAX_RS_APPLICATION_TYPE, value = JAX_RS_APPLICATION_TYPE_STATIC),
        @Property(name = JAX_RS_APPLICATION_CONTEXT, value = ADMIN_CONTEXT_NAME),
})
public class AdminApplication extends Application {

	@Override
	public Set<Object> getSingletons() {
		// This is only to simplify registration of the resource...
		return Collections.singleton(new AdminResource());
	}
}
