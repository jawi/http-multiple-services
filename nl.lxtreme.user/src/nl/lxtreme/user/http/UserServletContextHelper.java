package nl.lxtreme.user.http;

import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME;
import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_PATH;
import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_TARGET;

import org.apache.felix.dm.annotation.api.Component;
import org.apache.felix.dm.annotation.api.Property;
import org.osgi.service.http.context.ServletContextHelper;

/**
 * Defines a context for the "user" application, which is to be bound to the HTTP
 * service running on port 8080.
 */
@Component(provides = ServletContextHelper.class, properties = {
		@Property(name = HTTP_WHITEBOARD_CONTEXT_NAME, value = UserServletContextHelper.USER_CONTEXT_NAME),
		@Property(name = HTTP_WHITEBOARD_CONTEXT_PATH, value = "/user"),
		@Property(name = HTTP_WHITEBOARD_TARGET, value = "(org.osgi.service.http.port=8080)")
})
public class UserServletContextHelper extends ServletContextHelper {
	public static final String USER_CONTEXT_NAME = "userCtx";

}
