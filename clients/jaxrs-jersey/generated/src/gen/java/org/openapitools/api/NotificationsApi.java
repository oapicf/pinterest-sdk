package org.openapitools.api;

import org.openapitools.api.NotificationsApiService;
import org.openapitools.api.factories.NotificationsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.NotificationPostRequest;
import org.openapitools.model.NotificationResponse;
import org.openapitools.model.PinterestLibError;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/notifications")


@io.swagger.annotations.Api(description = "the notifications API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-30T09:54:14.357431345Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class NotificationsApi  {
   private final NotificationsApiService delegate;

   public NotificationsApi(@Context ServletConfig servletContext) {
      NotificationsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("NotificationsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (NotificationsApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = NotificationsApiServiceFactory.getNotificationsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Receive notifications from external partners.", notes = "Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.", response = NotificationResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "notification", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = NotificationResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response notificationPost(@ApiParam(value = "", required = true) @NotNull @Valid  NotificationPostRequest notificationPostRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.notificationPost(notificationPostRequest, securityContext);
    }
}
