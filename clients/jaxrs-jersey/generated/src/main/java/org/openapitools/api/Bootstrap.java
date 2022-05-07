package org.openapitools.api;

import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.*;

import io.swagger.models.auth.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class Bootstrap extends HttpServlet {
  @Override
  public void init(ServletConfig config) throws ServletException {
    Info info = new Info()
      .title("OpenAPI Server")
      .description("Pinterest's REST API")
      .termsOfService("https://developers.pinterest.com/terms/")
      .contact(new Contact()
        .email("pinterest-api@pinterest.com"))
      .license(new License()
        .name("MIT")
        .url("https://spdx.org/licenses/MIT"));

    ServletContext context = config.getServletContext();
    Swagger swagger = new Swagger().info(info);

    new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
  }
}
