package com.one.demo.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

// import com.one.demo.Security.SecurityConfig;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;

public class MainApp implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

        context.register(AppConfig.class);
        context.setServletContext(servletContext);
        ServletRegistration.Dynamic servletDynamic = servletContext.addServlet("dispacher",
                new DispatcherServlet(context));
        servletDynamic.setLoadOnStartup(1);
        servletDynamic.addMapping("/");
        // context.register(SecurityConfig.class);
        context.close();
    }

}
