package com.sample.web.entity;//package Entity;
//
//import com.example.demo.RestApiApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//
//@Configuration
//public class ApplicationInitializer extends SpringBootServletInitializer {
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
////        AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
////        context.register(ApplicationInitializer.class);
////        ServletRegistration.Dynamic dispatcher =
////                servletContext.addServlet("dispatcher", new DispatcherServlet(context));
////
////
////        dispatcher.setLoadOnStartup(1);
////
////        dispatcher.addMapping("/");
////
//
//        super.onStartup(servletContext);
//
//
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(RestApiApplication.class);
//    }
//
//    @Bean
//    public DispatcherServlet dispatcherServlet(){
//        return new DispatcherServlet();
//    }
////    @Bean
////    public DispatcherServletRegistrationBean registrationBean(){
////        return new DispatcherServletRegistrationBean();
////    }
//}
