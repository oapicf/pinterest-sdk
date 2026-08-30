package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.NotificationsApiService;
import org.openapitools.api.factories.NotificationsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.NotificationPostRequest;
import org.openapitools.model.NotificationResponse;
import org.openapitools.model.PinterestLibError;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/notifications")


@io.swagger.annotations.Api(description = "the notifications API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class NotificationsApi  {
   private final NotificationsApiService delegate = NotificationsApiServiceFactory.getNotificationsApi();

    @POST
    
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
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = NotificationResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = NotificationResponse.class) })
    public Response notificationPost(@ApiParam(value = "" ,required=true) NotificationPostRequest notificationPostRequest
)
    throws NotFoundException {
        return delegate.notificationPost(notificationPostRequest);
    }
}
