package nl.lxtreme.admin.http;

import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME;
import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_PATH;
import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_TARGET;

import org.apache.felix.dm.annotation.api.Component;
import org.apache.felix.dm.annotation.api.Property;
import org.osgi.service.http.context.ServletContextHelper;

/**
 * Defines a context for the "admin" application, which is to be bound to the HTTP
 * service running on port 9090.
 */
@Component(provides = ServletContextHelper.class, properties = {
		@Property(name = HTTP_WHITEBOARD_CONTEXT_NAME, value = AdminServletContextHelper.ADMIN_CONTEXT_NAME),
		@Property(name = HTTP_WHITEBOARD_CONTEXT_PATH, value = "/admin"),
		@Property(name = HTTP_WHITEBOARD_TARGET, value = "(org.osgi.service.http.port=9090)")
})
public class AdminServletContextHelper extends ServletContextHelper {
	public static final String ADMIN_CONTEXT_NAME = "adminCtx";

}
