package com.mantiso.events;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
        ServletContext ctx = event.getServletContext();
        ctx.log("Context initialised Julie");
        String productName = event.getServletContext().getInitParameter("ProductName");
        ctx.log("Context initialised Julie: " + productName);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
