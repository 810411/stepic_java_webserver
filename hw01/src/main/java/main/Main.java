package main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.AllRequestsServlet;

public class Main {
    public static void main(String[] args) throws Exception {
        AllRequestsServlet servlet = new AllRequestsServlet();

        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        contextHandler.addServlet(new ServletHolder(servlet), "/*");

        Server server = new Server(8080);
        server.setHandler(contextHandler);

        server.start();
        server.join();
    }
}
