package proyectobase.core;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import earlgrey.core.Earlgrey;

/**
 * Application Lifecycle Listener implementation class Core
 *
 */
@WebListener
public class Core implements ServletContextListener, ServletRequestListener {

    /**
     * Default constructor.
     */
    public Core() {
    }

    /**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0) {
    }

    /**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0) {
    }

    /**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
    }

    /**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
        Earlgrey earlgrey = new Earlgrey(arg0.getServletContext());
        System.out.println("EarlGrey inicializado: " + earlgrey.kernelname);
    }

}
